package de.neuxzdev.flappygame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import de.neuxzdev.flappygame.AssetHandeling.AssetLoader;
import de.neuxzdev.flappygame.GameObjects.BaseGameObject;

/**
 * Created by bened on 24.10.2016.
 */
public class GameRenderer {
    private final int gameHeight;
    private final int midPointY;
    private GameWorld worldref;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    private SpriteBatch batcher;


    public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
        this.worldref = world;
        this.gameHeight = gameHeight;
        this.midPointY = midPointY;
        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, 204);


        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(float runTime) {

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);


        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0, 0, 136, midPointY + 66);
        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 66, 136, 11);
        shapeRenderer.setColor(147 / 255.0f, 80 / 255.0f, 27 / 255.0f, 1);
        shapeRenderer.rect(0, midPointY + 77, 136, 52);

        shapeRenderer.end();

        batcher.begin();

        batcher.disableBlending();
        batcher.draw(AssetLoader.bg, 0, midPointY + 23, 136, 43);
        batcher.enableBlending();

        for (BaseGameObject bgo: worldref.getGameObjs()) {
            batcher.draw(AssetLoader.birdAnimation.getKeyFrame(runTime),
                    bgo.getX(), bgo.getY(), bgo.getWidth(), bgo.getHeight());
        }
        batcher.end();
    }
}
