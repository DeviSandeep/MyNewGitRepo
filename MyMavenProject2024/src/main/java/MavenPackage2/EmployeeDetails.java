package MavenPackage2;

public class EmployeeDetails {
String name;
int rollno;
AddressOne address;

public EmployeeDetails(String name,int rollno,AddressOne address) {
	this.name=name;
	this.rollno=rollno;
	this.address=address;
}
public void printDetails() {
	System.out.println(address.city);
	System.out.println(address.state);
	System.out.println(name);
	System.out.println(rollno);
}

	public static void main(String[] args) {
		AddressOne ao=new AddressOne("TVM","Kerala");
		EmployeeDetails ed=new EmployeeDetails("Devi",1,ao);
		ed.printDetails();

		

	}

}
