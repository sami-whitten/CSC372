package Shape;

public class Cylinder extends Shape {
	
	double radius;
	double height;
	
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surfaceArea() {
		double A;
		double r = this.radius;
		double h = this.height;
		
		A = (2*3.14159*r*h) + (2*3.14159*(Math.pow(r, 2)));
		
		return A;		
	}
	
	public double volume() {
		double V;
		double r = this.radius;
		double h = this.height;
		
		r = Math.pow(r, 2);
		V = 3.14159*r*h;
		
		return V;
		
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String sArea = Double.toString(this.surfaceArea());
		String Vol = Double.toString(this.volume());
		String combine = "CYLINDER" + newline + "Surface Area: " + sArea + newline + "Volume: " + Vol + newline;
		return combine;
	}
	

}
