package ExerciseonComposition2_7;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }
    public MyPoint getBegin() {
        return begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    public int[] getBeginXY() {
        return new int[]{getBeginX(),getBeginY()};
    }
    public int[] getEndXY() {
        return new int[]{getEndX(),getEndY()};
    }
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public void setBeginX(int beginX) {
        begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
         begin.setY(beginY);
    }
    public void setEndX(int endX) {
        end.setX(endX);
    }
    public void setEndY(int endY) {
        end.setY(endY);
    }
    public void setBeginXY(int beginX, int beginY) {
        begin.setX(beginX);
        begin.setY(beginY);
    }
    public void setEndXY(int endX, int endY) {
        end.setX(endX);
        end.setY(endY);
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        return Math.atan2(getBeginY() - getEndY(), getBeginX() - getEndX());
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
