package geo; // Declares that this class belongs to the geo package.
public class Geo { // Defines the main application class.
 public static void main(String[] args) { // Entry point of the program.
 // Creates a 2D point object with x = 3 and y = 4.
 Point p = new Point(3, 4);
 System.out.println("2D Point: " + p.showPoint()); // Prints the 2D point.
 System.out.println("Distance: " + p.distanceFromOrigin()); // Prints distance from origin.
 ThreeDPoint tdp = new ThreeDPoint(1, 2, 2); // Creates a 3D point object.


 System.out.println("3D Point: " + tdp.showPoint()); // Prints the 3D point.
 System.out.println("Dimensions: " + tdp.getDimensionCount()); // Prints the number of dimensions.
 // Stores both objects in an interface array to demonstrate polymorphism.
 Measurable[] shapes = {p, tdp};
 for (Measurable m : shapes) { // Loops through each object through the interface type.
 System.out.println("Display: " + m.showPoint()); // Prints each point using the shared method.
 }
 }
} 
