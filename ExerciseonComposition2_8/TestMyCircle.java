package ExerciseonComposition2_8;

import java.util.Arrays;

public class TestMyCircle {
    public static void main(String[] args) {
        // creating a circle without argument
        MyCircle c1 = new MyCircle();
        System.out.println("c1 = " + c1); // tostring

        // setters and getters
        c1.setCenter(new MyPoint(2, 2));
        System.out.println("c1's center = " + c1.getCenter());
        c1.setRadius(3);
        System.out.println("c1's radius = " + c1.getRadius());
        c1.setCenterX(4);
        c1.setCenterY(8);
        System.out.println("c1's center (x) = " + c1.getCenterX());
        System.out.println("c1's center (y) = " + c1.getCenterY());
        c1.setCenterXY(3, 3);
        System.out.println("c1's center = " + Arrays.toString(c1.getCenterXY()));

        // creating a circle with Mypoint argument
        MyCircle c2 = new MyCircle(new MyPoint(1, 1), 5);
        System.out.println("c2 = " + c2); // tostring

        // area and circumference
        System.out.println("c2's area = " + c2.getArea());
        System.out.println("c2's circumference = " + c2.getCircumference());

        // creating a circle with int arguments
        MyCircle c3 = new MyCircle(6, 6, 4);
        System.out.println("c3 = " + c3); // tostring

        // calculating distance
        System.out.println("c1 to c2 = " + c1.distance(c2));
        System.out.println("c2 to c3 = " + c2.distance(c3));
        System.out.println("c3 to c1 = " + c3.distance(c1));
    }
}
