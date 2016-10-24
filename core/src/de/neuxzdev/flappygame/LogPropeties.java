package de.neuxzdev.flappygame;

/**
 * Created by bened on 24.10.2016.
 */
public class LogPropeties {
    public static class LOGRegion
    {
        public static final String  GAME_SCREEN= "GameScreen";
        public static final String  GAME_CORE= "GameCore";
        public static final String  GAME_WORLD= "GameWorld";
        public static final String  GAME_RENDERN = "GameRenderer";
    }
    public static class LOGScreenArgs{
        public static final String  SCREEN_RESIZING= "resizing";
        public static final String  SCREEN_SHOW_CALLED= "show called";
        public static final String  SCREEN_HIDE_CALLED= "hide called";
        public static final String  SCREEN_PAUSE_CALLED= "pause called";
        public static final String  SCREEN_RESUME_CALLED= "resume called";
        public static final String  SCRENN_ATTATCHED = "Attached";
        public static String SCREEN_FPS(float delta)
        {return 1/delta + " FPS";}
    }
    public static class LOGCoreArgs{
        public static final String  CORE_CREATED = "created";
    }
    public static class LOGGameWorldArgs{
        public static final String  GAMEWORLD_UPDATE = "update";
    }
    public static class LOGRendererArgs{
        public static final String  RENDERER_RENDER = "render";
    }

}
