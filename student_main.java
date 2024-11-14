package student;

import java.util.ArrayList;
import java.util.Collections;

public class student_main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> students = new ArrayList<student>();
		
		students.add(new student(2931, "Legolas", "Ithilien"));
		students.add(new student(44, "Harry", "London"));
		students.add(new student(45, "Anakin", "Mustafar"));
		students.add(new student(87, "Aragorn", "Gondor"));
		students.add(new student(71, "Tom", "Albania"));
		students.add(new student(665, "Nicolas", "Paris"));
		students.add(new student(157, "Spock", "Vulcan"));
		students.add(new student(900, "Theta", "Gallifrey"));
		students.add(new student(1500, "Thor", "Asgard"));
		students.add(new student(112, "Steve", "New York"));
		
		System.out.println("Unsorted");
		for (int i = 0; i<students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		
		System.out.println("\nSorted by roll number");
		Collections.sort(students, new sortByRoll());
		for (int i = 0; i<students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		
		System.out.println("\nSorted by name");
		Collections.sort(students, new sortByName());
		for (int i = 0; i<students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
		
		

	}

}
