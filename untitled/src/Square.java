import java.awt.*;

/**
 * enkel klass för en fyrkant. Varje fyrkant är från början svart.
 */
public class Square {
    private int x_positions;
    private int y_position;
    private Color color;

    public Square(int x_positions, int y_position) {
        this.x_positions = x_positions;
        this.y_position = y_position;
        color = Color.black;
    }

    public int getX_positions() {
        return x_positions;
    }

    public int getY_position() {
        return y_position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
