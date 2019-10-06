package shit;

public class Triangle {
	double area;
	double a;
	double b;
	double c;
	String name;
	int number;
	
	
	
	Triangle(double area, int number, String name) {
		this.area = area;
		this.number = number;
		this.name = name;
	}
	
	Triangle(double area, int number) {
		this(area, number, "Undefined");
	}
	
	Triangle (double area) {
		this(area, 0, "Undefined");
	}
	
	
	public void showProperties () {
		System.out.println("\nName:\t\t" + name + "\nNumber:\t\t" + number + "\nArea:\t\t" + area);
	}
}
