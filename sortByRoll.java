package student;

import java.util.Comparator;

public class sortByRoll implements Comparator<student>{
	
	public int compare(student x, student y) {
		return Integer.valueOf(x.rollno).compareTo(y.rollno);
	}
}
