package shit;

public class Geometry {

	public static double getLength(double xStart, double yStart, double xEnd, double yEnd) {
		double result;
		result = Math.sqrt(((xEnd - xStart) * (xEnd - xStart)) + ((yEnd - yStart) * (yEnd - yStart)));
		return result;
		//System.out.println("\n\n=============================\n\nThe result is: " + result);
	}
	
	public static double getTriangleArea(double base, double hLength) {
		double area = 0.5 * base * hLength;
		return area;
	}
}
