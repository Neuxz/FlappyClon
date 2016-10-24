package de.neuxzdev.flappygame;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import de.neuxzdev.flappygame.AssetHandeling.AssetLoader;

public class FlappyClone extends Game {
	@Override
	public void create () {
		Gdx.app.log(LogPropeties.LOGRegion.GAME_CORE,LogPropeties.LOGCoreArgs.CORE_CREATED);
		AssetLoader.load();
		setScreen(new GameScreen());
	}
	@Override
	public void dispose(){
		super.dispose();
		AssetLoader.dispose();
	}
}
