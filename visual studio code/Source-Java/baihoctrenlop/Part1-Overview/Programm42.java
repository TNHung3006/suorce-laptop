// Programm42.java: Compute the area of a circle
public class Programm42 {
  /** Main method */
  public static void main(String[] args) {
    final double PI = 3.14159; // Declare a constant

    // Assign a radius
    double radius = 20;
    // Compute area
    double area = radius * radius * PI;

    // Display results
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  }
}

