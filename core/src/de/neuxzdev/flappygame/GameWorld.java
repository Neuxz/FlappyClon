package de.neuxzdev.flappygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import de.neuxzdev.flappygame.GameObjects.BaseGameObject;
import de.neuxzdev.flappygame.GameObjects.Bird;

import java.util.ArrayList;

/**
 * Created by bened on 24.10.2016.
 */
public class GameWorld {

    private Rectangle rect = new Rectangle(0, 0, 17, 12);

    private ArrayList<BaseGameObject> gameObs = new ArrayList<BaseGameObject>();;

    public GameWorld(int midPointY)
    {
        gameObs.add(new Bird(33, midPointY - 5, 17, 12));
    }
    public void update(final float delta) {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_WORLD,LogPropeties.LOGGameWorldArgs.GAMEWORLD_UPDATE);
        for (BaseGameObject bg: gameObs) {
            bg.update(delta);
        }
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }
    public Rectangle getRect() {
        return rect;
    }

    public ArrayList<BaseGameObject> getGameObjs()
    {
        return gameObs;
    }
}
