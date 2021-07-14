package ExerciseonComposition2_8;

public class MyCircle {
    private MyPoint center = new MyPoint();
    private int radius = 1;

    public MyCircle() {
        // no argument
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public int getRadius() {
        return radius;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setCenterX(int centerX) {
        this.center.setX(centerX);
    }
    public void setCenterY(int centerY) {
        this.center.setY(centerY);
    }
    public void setCenterXY(int centerX, int centerY) {
        this.center.setXY(centerX, centerY);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle circle) {
        return center.distance(circle.center);
    }
}