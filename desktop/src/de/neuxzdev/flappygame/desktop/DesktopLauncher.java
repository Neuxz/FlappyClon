package de.neuxzdev.flappygame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.neuxzdev.flappygame.FlappyClone;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "FlappzClone";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new FlappyClone(), config);
	}
}
