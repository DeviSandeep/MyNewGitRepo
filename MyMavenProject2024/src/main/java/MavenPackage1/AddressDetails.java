package MavenPackage1;

public class AddressDetails {
	String city;
	String state;
	StudentDetails stu;
	
	public AddressDetails(String city,String state,StudentDetails stu) {
		this.city=city;
		this.state=state;
		this.stu=stu;
		
	}
	
	public void printDetails() {
		System.out.println(stu.name);
		System.out.println(stu.rollno);
		System.out.println(city);
		System.out.println(state);
		
	}
	
	public static void main(String[] args) {
		StudentDetails sd=new StudentDetails("Devi",1);
		AddressDetails ab=new AddressDetails("TVM","Kerala",sd);
		ab.printDetails();
		

	}

}
