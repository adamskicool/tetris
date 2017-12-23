import javax.swing.*;
import java.awt.*;

/**
 * Created by AdamDaBaows on 2017-12-23.
 */
public class PlayingField extends JPanel {
    public PlayingField(int height, int width){

    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 10, 10);
    }
}
