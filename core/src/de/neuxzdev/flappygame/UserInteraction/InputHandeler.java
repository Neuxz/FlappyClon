package de.neuxzdev.flappygame.UserInteraction;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import de.neuxzdev.flappygame.GameObjects.BaseGameObject;
import de.neuxzdev.flappygame.GameObjects.Bird;

/**
 * Created by Benedikt on 24.10.2016.
 */
public class InputHandeler implements InputProcessor{
    BaseGameObject userBird;
    public InputHandeler(BaseGameObject bird)
    {
        userBird = bird;
    }
    @Override
    public boolean keyDown(int keycode) {
        switch (keycode)
        {
            case Input.Keys.SPACE:userBird.onClick();break;
            default:break;
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        userBird.onClick();
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
