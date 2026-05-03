package geo; // Declares the package for the point classes.
public abstract class AbstractPoint implements Measurable { // Base class for shared point behavior.
 protected double x; // Stores the x coordinate and allows subclasses to access it.
 protected double y; // Stores the y coordinate and allows subclasses to access it.
 public AbstractPoint(double x, double y) { // Constructor that initializes the coordinates.
 this.x = x; // Saves the x coordinate in the object.
 this.y = y; // Saves the y coordinate in the object.
 }
 // Forces subclasses to report how many dimensions they represent.
 abstract public int getDimensionCount();
}