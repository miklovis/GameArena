import javax.swing.*;

public class Driver {

    private static int START_POSITION_X = 80;
    private static int START_POSITION_Y = 80;
    private static int TABLE_LENGTH = 960;
    private static int TABLE_WIDTH = 480;
    private static JFrame myWindow = new JFrame();
    private static Board gameBoard = new Board();
    private static GameArena myArena = new GameArena(1120, 640, true);
    private static Rectangle outsideRectangle = new Rectangle(40, 40, 1040, 560, "DARKGREY");
    private static Rectangle insideRectangle = new Rectangle(80, 80, 960, 480, "GREEN");
    private static Ball[] ballPockets = new Ball[6];
    public static void main(String[] args)
    {
        myArena.addRectangle(outsideRectangle);
        myArena.addRectangle(insideRectangle);
        for(int i = 0; i < 6; i++)
        {
            ballPockets[i] = new Ball(START_POSITION_X + (i % 3 * TABLE_WIDTH), START_POSITION_Y + (i / 3 * TABLE_WIDTH), 48, "BLACK");
            myArena.addBall(ballPockets[i]);
        }
    }
}