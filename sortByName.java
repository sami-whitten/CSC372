package student;

import java.util.Comparator;

public class sortByName implements Comparator<student> {

	
	public int compare(student x, student y) {
		return x.name.compareTo(y.name);
	}

}
