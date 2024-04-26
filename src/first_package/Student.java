// Student class
package first_package;

public class Student {
    private String name;
    private int id;
    private double[] grades; // Array to store grades

    public Student(String name, int id, int numOfSubjects) {
        this.setName(name);
        this.id = id;
        this.grades = new double[numOfSubjects]; // Initialize grades array
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    // Getter and setter methods for name, id, and grades
    // You can add additional methods as needed
}