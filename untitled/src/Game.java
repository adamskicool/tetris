import javax.swing.*;

/**
 * Created by AdamDaBaows on 2017-12-21.
 */
public class Game {

    public Game(int height, int width){
        JFrame frame = setupJFrame(height, width);
        //lägg till komponenten PlayingField
        PlayingField p = new PlayingField(height, width);
        frame.add(p);
    }


    private JFrame setupJFrame(int height, int width){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(height, width);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        return frame;
    }



    public static void main(String[] args){
        //starta ett nytt spel :)
        new Game(600, 400);
    }
}
