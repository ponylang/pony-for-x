
public class Measurements {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Rectangle r = new Rectangle(i, i + 2);
            System.out.printf(
                "Width and height: %s\nCircumference: %d\nArea: %d\n\n",
                r.dimensions(), r.circumference(), r.area());
        }
    }
}

class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String dimensions() {
        return width + " " + height;
    }

    public int circumference() {
        return 2 * (width + height);
    }

    public int area() {
        return width * height;
    }
}
