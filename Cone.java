package Shape;

public class Cone extends Shape{
	
	double radius;
	double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surfaceArea() {
		double A;
		double r = this.radius;
		double h = this.height;		
		
		A = (3.14159 * r) * (r + (Math.sqrt((Math.pow(h, 2)) + (Math.pow(r, 2)))));
		
		return A;
	}
	
	public double volume() {
		double V;
		double r = this.radius;
		double h = this.height;
		
		V = 3.14159 * (Math.pow(r, 2)) * (h/3);
		
		return V;
	}
	
	public String toString() {
		String newline = System.lineSeparator();
		String sArea = Double.toString(this.surfaceArea());
		String Vol = Double.toString(this.volume());
		String combine = "CONE" + newline + "Surface Area: " + sArea + newline + "Volume: " + Vol + newline;
		return combine;
	}
	

}
