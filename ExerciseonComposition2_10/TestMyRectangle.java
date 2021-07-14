package ExerciseonComposition2_10;

import java.util.Arrays;

public class TestMyRectangle {
    public static void main(String[] args) {
        // creating points for rectangles
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 10);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        p1.setXY(-10, -10);
        System.out.println(Arrays.toString(p1.getXY()));

        // creating square
        MyRectangle r1 = new MyRectangle(p1, p2);
        System.out.println("r1 = " + r1);
        System.out.println("r1's length = " + r1.getLength());
        System.out.println("r1's width = " + r1.getWidth());
        System.out.println("r1's area = " + r1.getArea());
        System.out.println("r1's perimeter = " + r1.getPerimeter());
        System.out.println("r1's type = " + r1.getType());

        // creating golden rectangle
        MyRectangle r2 = new MyRectangle(-20, 30, 20, -34);
        System.out.println("r2 = " + r2);
        System.out.println("r2's length = " + r2.getLength());
        System.out.println("r2's width = " + r2.getWidth());
        System.out.println("r2's area = " + r2.getArea());
        System.out.println("r2's perimeter = " + r2.getPerimeter());
        System.out.println("r2's type = " + r2.getType());

        // creating regular rectangle
        MyRectangle r3 = new MyRectangle(-15, 40, 30, 20);
        System.out.println("r3 = " + r3);
        System.out.println("r3's length = " + r3.getLength());
        System.out.println("r3's width = " + r3.getWidth());
        System.out.println("r3's area = " + r3.getArea());
        System.out.println("r3's perimeter = " + r3.getPerimeter());
        System.out.println("r3's type = " + r3.getType());
    }
}
