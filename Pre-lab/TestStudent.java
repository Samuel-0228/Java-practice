package et.edu.aau;



public class Student {

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


public class TestStudent{
 public static void main(String[] args){
 Student s=new Student();
 s.setFirstName("Abebe");
 s.setLastName("Kebede");
 s.setYear(4);
 System.out.println("Student details");
 System.out.println("First Name: "+s.getFirstName());
 System.out.println("Last Name: "+s.getLastName());
 System.out.println("Year: "+s.getYear());
 }
 }