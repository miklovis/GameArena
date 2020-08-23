import javax.swing.*;

public class Driver {

    private static int START_POSITION_X = 80;
    private static int START_POSITION_Y = 80;
    private static int TABLE_LENGTH = 960;
    private static int TABLE_WIDTH = 480;
    private static int END_POSITION_X = START_POSITION_X + TABLE_LENGTH;
    private static int END_POSITION_Y = START_POSITION_Y + TABLE_WIDTH;
    private static int POOL_BALL_DIAMETER = 24;
    private static int HOLE_DIAMETER = 45;
    
    private static JFrame myWindow = new JFrame();
    private static Board gameBoard = new Board();
    private static GameArena myArena = new GameArena(1120, 640, true);
    private static Rectangle outsideRectangle = new Rectangle(40, 40, 1040, 560, "DARKGREY");
    private static Rectangle insideRectangle = new Rectangle(80, 80, 960, 480, "GREEN");
    private static Line baulkLine = new Line(START_POSITION_X + TABLE_LENGTH / 4, START_POSITION_Y, START_POSITION_X + TABLE_LENGTH / 4, END_POSITION_Y, 1, "WHITE");
    private static Ball[] ballPockets = new Ball[6];
    private static Ball[] poolBalls = new Ball[16];
    public static void main(String[] args)
    {
        myArena.addRectangle(outsideRectangle);
        myArena.addRectangle(insideRectangle);
        myArena.addLine(baulkLine);
        for(int i = 0; i < ballPockets.length; i++)
        {
            ballPockets[i] = new Ball(START_POSITION_X + (i % 3 * TABLE_WIDTH), START_POSITION_Y + (i / 3 * TABLE_WIDTH), HOLE_DIAMETER, "BLACK");
        }
        myArena.addBalls(ballPockets, ballPockets.length);

        poolBalls[0] = new Ball(START_POSITION_X + TABLE_LENGTH / 4, START_POSITION_Y + TABLE_WIDTH / 2, POOL_BALL_DIAMETER, "WHITE");
        poolBalls[8] = new Ball(START_POSITION_X + 3 * (TABLE_LENGTH / 4), START_POSITION_Y + TABLE_WIDTH / 2, POOL_BALL_DIAMETER, "BLACK");

    }
}