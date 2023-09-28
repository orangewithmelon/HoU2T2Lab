public class Point {
    private int x;
    private int y;

    public Point(int num1, int num2) {
        x = num1;
        y = num2;
    }

    public Point(int num1) {
        x = num1;
        y = num1;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x == 0) {
            if (y == 0) {
                return "The coordinate is in the origin";
            } else {
                return "The coordinate is on an axis";
            }
        } else {
            if (y == 0)
        }
        if (x > 0) {
            if (y > 0) {
                return "The coordinate is in quadrant I";
            } else {
                return "The coordinate is in quadrant 3";
            }
        }
    }
}
