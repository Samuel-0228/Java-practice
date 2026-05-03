package geo; // Declares the package for the 3D point class.
public class ThreeDPoint extends Point { // Extends Point by adding a z coordinate.
 protected double z; // Stores the z coordinate.

  public ThreeDPoint(double x, double y, double z) { // Constructor for a 3D point.
 super(x, y); // Initializes the x and y coordinates using the parent constructor.
 this.z = z; // Stores the z coordinate in this object.
 }
 @Override
 public int getDimensionCount() { // Reports that this object is 3D.
 return 3; // A ThreeDPoint has three dimensions.
 }
 @Override
 public String showPoint() { // Builds a text representation including z.
 return "(" + this.x + ", " + this.y + ", " + this.z + ")"; // Formats the coordinates as (x, y, z).
 }
 // distanceFromOrigin() is inherited from Point and still uses only x and y.
}