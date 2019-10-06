package shit;

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		System.out.println("Straight\n\n");
		Triangle straight = new Triangle(triangleArea(), 3);
		System.out.println("Fuck\n\n");
		Triangle fuck = new Triangle(triangleArea(), 1, "fuck");
		straight.showProperties();
		fuck.showProperties();
	}
	
	static double triangleArea() {
		in = new Scanner(System.in);
		double xStart;
		double yStart;
		double xEnd;
		double yEnd;
		double base;
		double height;
		System.out.println("Base...\n\n");
		System.out.println("Print x1:");
		xStart = in.nextDouble();
		System.out.println("Print y1:");
		yStart = in.nextDouble();
		System.out.println("Print x2:");
		xEnd = in.nextDouble();
		System.out.println("Print y2:");
		yEnd = in.nextDouble();
		base = Geometry.getLength(xStart, yStart, xEnd, yEnd);
		System.out.println("Height...\n\n");
		System.out.println("Print x1:");
		xStart = in.nextDouble();
		System.out.println("Print y1:");
		yStart = in.nextDouble();
		System.out.println("Print x2:");
		xEnd = in.nextDouble();
		System.out.println("Print y2:");
		yEnd = in.nextDouble();
		height = Geometry.getLength(xStart, yStart, xEnd, yEnd);
		System.out.println("The area of the triangle is " + Geometry.getTriangleArea(base, height) + " cm.\n\n");
		return Geometry.getTriangleArea(base, height);
	}
}