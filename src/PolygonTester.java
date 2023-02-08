import org.w3c.dom.ls.LSOutput;
import java.lang.Math;
import java.math.MathContext;

/**
 * @date 2/4/2023
 * @author Caleb Rubow
 * @file PolygonTester.java
 * @description This class creates an object using the constructors in the Polygon.java file.
 */
public class PolygonTester {
    public static void main(String[] args) {
        Polygon newPolygon = new Polygon(4, 2, "Quadrilateral");
        Polygon newSecondPolygon = new Polygon();
        Polygon invalidPolygon = new Polygon(9, -1, "Nonagon");
        Polygon secondInvalidPolygon = new Polygon(2, 10, "Nonagon");
        System.out.println(newPolygon);
        System.out.println(newSecondPolygon);
        System.out.println(invalidPolygon);
        System.out.println(secondInvalidPolygon);

        System.out.println("");

        newPolygon.setNumSides(6);
        newPolygon.setShapeType("Hexagon");
        newPolygon.setSideLength(3);
        System.out.println("This should print out a length of 3.0, number of sides 6 and a shape type of Hexagon");
        System.out.println(newPolygon);
    }
}
