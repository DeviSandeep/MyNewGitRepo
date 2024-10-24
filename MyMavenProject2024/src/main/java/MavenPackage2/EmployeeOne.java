package MavenPackage2;

public class EmployeeOne {
	int id;
	String name;
	Address address;//entity reference, HAS-A relationship
	
	public EmployeeOne(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void printDetails() {
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
		System.out.println(id);
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		Address addr1=new Address("TVM","Kerala","India");
		EmployeeOne e1=new EmployeeOne(1,"Devi",addr1);
		e1.printDetails();
		
		Address addr2=new Address("EKM","Kerala","India");
		EmployeeOne e2=new EmployeeOne(2,"Priyanka",addr2);
		e2.printDetails();
		

	}

}
