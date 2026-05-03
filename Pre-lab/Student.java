class Student {

 private String firstName;
 private String lastName;
 private int id;
 private double gpa; 

 public String getFirstName() {
 return firstName;
 }
 public String getLastName(){
 return lastName;
 }
 public int getId() {
 return id;
 }
 public double getGpa() {
 return gpa;
 }
 // Mutators (Setters)
 public void setFirstName(String firstName) {
 this.firstName = firstName;
 }
 public void setLastName(String lastName){
 this.lastName=lastName;
 }
 public void setId(int id) {
 this.id = id;
 }
 public void setGpa(double gpa) {
 if (gpa >= 0.0 && gpa <= 4.0) { // Simple validation
 this.gpa = gpa;
 }
 }
}
