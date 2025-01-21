package MavenPackage1;

public class ContractorChild extends SuperEmployee {
    int workinghours=12;
	int payment=1000;
	
	public void calculateSalary() {
		int totalpayment=workinghours*payment;
		System.out.println(totalpayment);
	}

	public static void main(String[] args) {
		SuperEmployee s=new ContractorChild();
		s.calculateSalary();
		
		

	}

}
