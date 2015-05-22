import org.newdawn.slick.*;

/**
 * Created by stanners on 22/05/2015.
 */
public class Game extends BasicGame {

    public static boolean DEBUG = true;
    public static int FRAMERATE = 60;
    public static int DISPLAY_WIDTH = 800;
    public static int DISPLAY_HEIGHT = 600;

    public Game(String gameName){
        super(gameName);

        try {

            AppGameContainer container = new AppGameContainer(this);
            container.setDisplayMode(DISPLAY_WIDTH, DISPLAY_HEIGHT, false);
            container.setVSync(true); // jesus h christ this needs to be on
            container.setTargetFrameRate(FRAMERATE); // TODO remove the /2 after testing screen scrolling
            container.start();

        } catch (SlickException e) {
            System.out.println("Failed to start the container");
            e.printStackTrace();
            System.exit(0);
        }

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics screen) throws SlickException {
        screen.drawString("Template running.", 10, 30);
    }

    public static void main(String args[]){
        Game game = new Game("Game Template");
    }

}
