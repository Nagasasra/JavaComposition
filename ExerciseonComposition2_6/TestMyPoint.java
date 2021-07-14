package ExerciseonComposition2_6;

import java.util.Arrays;

public class TestMyPoint {
    public static void main(String[] args) {

        // creating new point class without arguments
        MyPoint p1 = new MyPoint();
        // setters and getters
        p1.setY(4);
        p1.setX(7);
        System.out.println("x = " + p1.getX());
        System.out.println("y = " + p1.getY());
        p1.setXY(3,2);
        System.out.println("x, y = " + Arrays.toString(p1.getXY())); // tostring

        // creating new point class with arguments
        MyPoint p2 = new MyPoint(2,4);
        System.out.println("p2 = " + p2); // tostring
        // calculating distances
        System.out.println("Distance to (0,0) = " + p1.distance());
        System.out.println("Distance to (6,8) = " + p1.distance(6,8)); // random coordinates
        System.out.println("Distance to p2 = " + p1.distance(p2));
    }
}
