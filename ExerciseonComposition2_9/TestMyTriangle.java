package ExerciseonComposition2_9;

import java.util.Arrays;

public class TestMyTriangle {
    public static void main(String[] args) {
        // creating the 3 points
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(5, 5);
        MyPoint p3 = new MyPoint(8, 0);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = "+ p3);

        // setters and getters for points
        p3.setXY(10, 0);
        System.out.println("p3 coordinates = " + Arrays.toString(p3.getXY()));

        // distances
        System.out.println("p1 to (0, 0) = " + p1.distance());
        System.out.println("p2 to (6, 6)  = "+ p2.distance(6, 6));

        // creating triangles
        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        MyTriangle t2 = new MyTriangle(2, 2, 4, -2, -10, 0);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t1's perimeter = " + t1.getPerimeter());
        System.out.println("t1's type = " + t1.getType());
        System.out.println("t1's perimeter = " + t2.getPerimeter());
        System.out.println("t1's type = " + t2.getType());

    }
}
