package ExerciseonComposition2_10;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public MyRectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        this.topLeft = new MyPoint(topLeftX, topLeftY);
        this.bottomRight = new MyPoint(bottomRightX, bottomRightY);
    }
    public double getLength() {
        if (topLeft.distance(new MyPoint(bottomRight.getX(), topLeft.getY())) >= new MyPoint(bottomRight.getX(), topLeft.getY()).distance(bottomRight)) {
            return topLeft.distance(new MyPoint(bottomRight.getX(), topLeft.getY()));
        }
        else return new MyPoint(bottomRight.getX(), topLeft.getY()).distance(bottomRight);
    }
    public double getWidth() {
        if (new MyPoint(bottomRight.getX(), topLeft.getY()).distance(bottomRight) <= topLeft.distance(new MyPoint(bottomRight.getX(), topLeft.getY()))) {
            return new MyPoint(bottomRight.getX(), topLeft.getY()).distance(bottomRight);
        }
        else return topLeft.distance(new MyPoint(bottomRight.getX(), topLeft.getY()));
    }
    public double getArea() {
        return getLength() * getWidth();
    }
    public double getPerimeter() {
        return getLength() * 2 + getWidth() * 2;
    }
    public String getType() {
        if (getLength() == getWidth()) {
            return "Square";
        }
        else if (getLength() == 1.6 * getWidth()) {
            return "Fibonacci Rectangle";
        }
        else return "Regular Rectangle";
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
