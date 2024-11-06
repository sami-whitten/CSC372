package Provide_Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Provide_Product {
	
	
	

	public static void main(String[] args) {
		//declare scanner, and list 
		Scanner userInput = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		//have user input 5 numbers
		for (int i = 0; i < 5; ++i) {
			System.out.println("Enter number: ");
			//add numbers to list
			numbers.add(userInput.nextInt());			
		}
		//pass list and index of 0 to method and output results to console
		System.out.println(sum(numbers,0));
	}
	
	public static int sum(List<Integer> numbers, int i) {
		//if no elements to add, return 0
		if(i == numbers.size()) {
			return 0;
		}
		//add current index item to sum of the remaining items
		return numbers.get(i)+sum(numbers,i+1);		
	}
}
