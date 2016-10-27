package de.neuxzdev.flappygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import de.neuxzdev.flappygame.BackgroundHandeling.AssetLoader;
import de.neuxzdev.flappygame.BackgroundHandeling.ScrollHandler;
import de.neuxzdev.flappygame.GameObjects.BaseGameObject;
import de.neuxzdev.flappygame.GameObjects.Bird;

import java.util.ArrayList;

/**
 * Created by bened on 24.10.2016.
 */
public class GameWorld {

    private Rectangle rect = new Rectangle(0, 0, 17, 12);

    private ArrayList<BaseGameObject> gameObs = new ArrayList<BaseGameObject>();

    private ScrollHandler scroller;

    private boolean isAlive = true;

    public GameWorld(int midPointY)
    {
        gameObs.add(new Bird(33, midPointY - 5, 17, 12));
        scroller = new ScrollHandler(midPointY + 66);//Graß
    }
    public void update(final float delta) {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_WORLD,LogPropeties.LOGGameWorldArgs.GAMEWORLD_UPDATE);
        scroller.update(delta);
        for (BaseGameObject bg: gameObs) {
            bg.update(delta);
        }
        if (isAlive && scroller.collides(getPlayer())) {
            scroller.stop();
            AssetLoader.dead.play();
            isAlive = false;
        }
    }

    public ArrayList<BaseGameObject> getGameObjs()
    {
        return gameObs;
    }

    public BaseGameObject getPlayer() {
        return gameObs.get(0);//FirstElement is always Player und so
    }

    public ScrollHandler getScroller() {
        return scroller;
    }
}
