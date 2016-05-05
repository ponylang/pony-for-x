
public class Measurements {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Rectangle r = new Rectangle(i, i + 2);
            String s = "Width and height: " + r.dimensions() +
                "\nCircumference: " + r.circumference() +
                "\nArea: " + r.area() + "\n";
            System.out.println(s);
        }
    }
}

class Rectangle {
    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public String dimensions() {
        return width + " " + height;
    }

    public float circumference() {
        return 2 * (width + height);
    }

    public float area() {
        return width * height;
    }
}
