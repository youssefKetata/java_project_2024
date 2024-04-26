// Subject class
package first_package;

public class Subject {
    private String name;
    private double[] grades; // Array to store grades

    public Subject(String name, int numOfStudents) {
        this.name = name;
        this.grades = new double[numOfStudents]; // Initialize grades array
    }

    // Getter and setter methods for name and grades
    // You can add additional methods as needed
}	