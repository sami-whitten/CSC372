package Shape;

public class Sphere extends Shape {

	double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double surfaceArea() {
		//declare variables
		double A;
		double r = Math.pow(this.radius, 2);
		
		//calculate surface area
		A = 4*3.14159;
		A = A*r;
		return A;
	}
	
	public double volume() {
		double V;
		double r = Math.pow(this.radius, 3);
		V = 1.333 * 3.1416;
		V = V*r;
		
		return V;
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String sArea = Double.toString(this.surfaceArea());
		String Vol = Double.toString(this.volume());
		String combine = "SPHERE" + newline + "Surface Area: " + sArea + newline + "Volume: " + Vol + newline;
		return combine;
		
	}

}
