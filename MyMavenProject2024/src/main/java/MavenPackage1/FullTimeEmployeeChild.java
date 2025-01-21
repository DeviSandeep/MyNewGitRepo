package MavenPackage1;

public class FullTimeEmployeeChild extends SuperEmployee {
	final int workinghours=8;
	int payment=1000;
	
	public void calculateSalary() {
		int totalpayment=workinghours*payment;
		System.out.println(totalpayment);
		
	}

	public static void main(String[] args) {
		SuperEmployee s=new FullTimeEmployeeChild();
		s.calculateSalary();

	}

}
