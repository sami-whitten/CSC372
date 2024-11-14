package student;

public class student {
	
	int rollno;
	String name;
	String address;
	
	public student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	int getRollno() {
		return rollno;
	}
	
	String getNName() {
		return name;
	}
	
	String getAddress() {
		return address;
	}
	
	public String toString() {
		return "ID: " + this.rollno + "\nName:" + this.name + "\nAddress: " + this.address;
	}

}
