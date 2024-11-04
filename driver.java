package Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter radius of the sphere: ");
		double r = userInput.nextDouble();
		Sphere sphere1 = new Sphere(r);
		
		System.out.println("Enter radius of the cylinder: ");
		r = userInput.nextDouble();
		System.out.println("Enter height of the cylinder: ");
		double h = userInput.nextDouble();
		Cylinder cylinder1 = new Cylinder(r,h);
		
		System.out.println("Enter radius of the cone: ");
		r = userInput.nextDouble();
		System.out.println("Enter height of the cone: ");
		h = userInput.nextDouble();
		Cone cone1 = new Cone(r,h);
		
		shapes.add(sphere1);
		shapes.add(cylinder1);
		shapes.add(cone1);
		
		for (Shape i : shapes) {
			System.out.println(i);
		}
		

	}

}
