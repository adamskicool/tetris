import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by AdamDaBaows on 2017-12-23.
 */
public class KeyboardInput implements KeyListener {
    private PlayingField playingField;

    public KeyboardInput(PlayingField playingField) {
        this.playingField = playingField;
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            playingField.getSquares()[1][1].setColor(Color.RED);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
