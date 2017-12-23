import javax.swing.*;
import java.awt.*;

/**
 * Created by AdamDaBaows on 2017-12-23.
 */
public class PlayingField extends JPanel {
    //dela in spelplanen i rutor(squares).
    private Square[][] squares;
    //rutorna har alltid en sidolängd på 10 pixlar.
    public final int square_sidelength = 10;

    public PlayingField(int height, int width){
        //lägg till keyboard lyssnare.
        this.addKeyListener(new KeyboardInput(this));
        this.setFocusable(true);
        this.requestFocusInWindow();
        //fyll rutorna med Square objekt.
        setupSquares(height, width);
    }

    private void setupSquares(int height, int width){
        //initialisera arrayen av rutor.
        squares = new Square[height/square_sidelength][width/square_sidelength];
        //fyll den med rutor som täcker hela spelplanen.
        for(int i = 0; i < height; i += square_sidelength){
            for(int j = 0; j < width; j += square_sidelength){
                squares[i/square_sidelength][j/square_sidelength] = new Square(i, j);
            }
        }
    }


    @Override
    public void paintComponent(Graphics g){
        paintSquares(g);
    }


    /**
     * Måla alla rutorna på spelplanen.
     * @param g Grafik komponent.
     */
    private void paintSquares(Graphics g){
        for(Square[] squares_: squares){
            for(Square square: squares_){
                g.setColor(square.getColor());
                g.fillRect(square.getX_positions(), square.getY_position(), square_sidelength, square_sidelength);
            }
        }
    }

    public Square[][] getSquares() {
        return squares;
    }
}
