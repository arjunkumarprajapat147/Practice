/*
 * Practice 18: Methods
 * Task: Write methods for area of circle and rectangle.
 * Author: Arjun Kumar
 * Run: javac Practice18.java && java Practice18
 */
public class Practice18 {

    static double circleArea(double r) {
        return Math.PI * r * r;
    }

    static double rectangleArea(double l, double w) {
        return l * w;
    }

    public static void main(String[] args) {
        System.out.printf("Circle (r=5): %.2f%n", circleArea(5));
        System.out.println("Rectangle (4x6): " + rectangleArea(4, 6));
    }
}
