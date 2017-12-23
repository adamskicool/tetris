import javax.swing.*;

/**
 * Created by AdamDaBaows on 2017-12-21.
 */
public class Game {

    public Game(int height, int width){
        setupJFrame(height, width);
    }


    private void setupJFrame(int height, int width){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(height, width);
        frame.setLocationRelativeTo(null);
        //lägg till komponenten PlayingField
        PlayingField p = new PlayingField(height, width);
        frame.add(p);
        //det sista man gör är att göra fönstret synligt.
        frame.setVisible(true);
    }



    public static void main(String[] args){
        //starta ett nytt spel :)
        new Game(600, 400);
    }
}
