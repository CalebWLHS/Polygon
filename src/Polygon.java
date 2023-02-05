/**
 * @date 2/4/2023
 * @author Caleb Rubow
 * @file Polygon.java
 * @description This class creates a Polygon object and assigns the attributes numberOfSides, sideLength and
 * shapeType. This class has accessors for the three instance variables that define the polygon.
 * The class has methods that calculate the perimeter and area.
 */
import java.text.DecimalFormat;
public class Polygon {

    private int numberOfSides;
    private double sideLength;
    private String shapeType;
    private double perimeter;
    private double area;
    /**
     * Default Constructor that assigns the numberOfSides to 3, sideLength to 1.0 and shapeType to Triangle
     */
    public Polygon(){
        numberOfSides = 3;
        sideLength = 1;
        shapeType = "Triangle";
        calculatePerimeter();
        calculateArea();
    }

    /**
     * Overloaded Constructor that assigns three variables that make a polygon
     * @param numberOfSides assigns the number of sides as a int for the polygon
     * @param sideLength assigns the side length as a double for the polygon
     * @param shapeType assigns the shape type as a String for the polygon
     */
    public Polygon(int numberOfSides, double sideLength, String shapeType){
        if(numberOfSides >= 3){
            this.numberOfSides = numberOfSides;
            this.shapeType = shapeType;
        }
        else{
            this.shapeType = "";
            this.numberOfSides = 1;
        }
        if(sideLength >0){
            this.sideLength = sideLength;
        }
        else{
            this.shapeType = "";
        }
        calculatePerimeter();
        calculateArea();
    }

    /**
     * @return returns the int variable numberOfSides of the polygon
     */
    public int getNumSides(){
        return numberOfSides;
    }

    /**
     * @return returns the double variable sideLength of the polygon
     */
    public double getSideLength(){
        return sideLength;
    }

    /**
     * @return returns the String variable shapeType of the polygon
     */
    public String getShapeType(){
        return shapeType;
    }

    /**
     * @return returns the perimeter of the polygon
     */
    public double getPerimeter(){
        return perimeter;
    }

    /**
     * @return returns the area of the polygon
     */
    public double getArea(){
        return area;
    }

    /**
     * Method that multiplies the int variable numberOfSides and double variable sideLength to get the Perimeter
     */
    public void calculatePerimeter(){
        perimeter = (numberOfSides * sideLength);
    }

    /**
     * Method that finds the area of a defined Polygon
     */
    public void calculateArea(){
        area = ((numberOfSides*sideLength*(sideLength/(2*Math.tan((Math.PI/numberOfSides)))))/2);

    }

    /**
     * Allows the user to change the number of sides and the shape type and changes the perimeter and area respectively
     * @param numberOfSides desired number of sides
     * @param shapeType desired shape type
     */
    public void setNumSidesAndShapeType(int numberOfSides, String shapeType){
        this.numberOfSides = numberOfSides;
        this.shapeType = shapeType;
        calculatePerimeter();
        calculateArea();
    }

    /**
     * Allows the user to change the side length and changes the perimeter and area respectively
     * @param sideLength desired side length
     */
    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
        calculatePerimeter();
        calculateArea();
    }

    /**
     *@return Prints the number of sides, the side length, the shape type, the perimeter and the area (to three decimal places)
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.###");
        if(!shapeType.equals("")) {
            return "Your shape is a " + shapeType + " and it has " + numberOfSides + " sides. \nIt has a side length of " + sideLength + ". \nIt has a perimeter of " + df.format(perimeter) + " units and an area of " + df.format(area) + " units.";
        }
        else{
            return "One of the variables you put in was invalid.";
        }

    }


}
