/**
 * Created by AdamDaBaows on 2017-12-21.
 */
public class Square {
    private int x_positions;
    private int y_position;
    private int height;
    private int width;

    public Square(int x_positions, int y_position) {
        this.x_positions = x_positions;
        this.y_position = y_position;
    }

    public int getX_positions() {
        return x_positions;
    }

    public int getY_position() {
        return y_position;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setX_positions(int x_positions) {
        this.x_positions = x_positions;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }
}
