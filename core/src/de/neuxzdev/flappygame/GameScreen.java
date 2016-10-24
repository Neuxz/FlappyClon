package de.neuxzdev.flappygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import de.neuxzdev.flappygame.UserInteraction.InputHandeler;

/**
 * Created by bened on 24.10.2016.
 */
public class GameScreen implements Screen{
    private GameWorld world;
    private GameRenderer renderer;
    private float runTime = 0;

    public GameScreen(){
        super();

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);
        int midPointY = (int) (gameHeight / 2);
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCRENN_ATTATCHED);
        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int)gameHeight, midPointY);
        Gdx.input.setInputProcessor(new InputHandeler(world.getGameObjs().get(0)));
    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCREEN_FPS(delta));
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCREEN_RESIZING);
    }

    @Override
    public void pause() {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCREEN_PAUSE_CALLED);
    }

    @Override
    public void show() {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCREEN_SHOW_CALLED);
    }

    @Override
    public void resume() {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCREEN_RESUME_CALLED);
    }

    @Override
    public void hide() {
        Gdx.app.log(LogPropeties.LOGRegion.GAME_SCREEN, LogPropeties.LOGScreenArgs.SCREEN_HIDE_CALLED);
    }

    @Override
    public void dispose() {

    }
}
