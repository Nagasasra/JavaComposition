package ExerciseonComposition2_7;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
        // no argument
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY() {
        return new int[]{getX(),getY()};
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(getX()-x, 2)+Math.pow(getY()-y, 2));
    }
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(getX()-point.getX(), 2)+Math.pow(getY()-point.getY(), 2));
    }
    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2));
    }
}
