package MavenPackage1;

public class HDFCOne implements RBIOne {
	int tenure=12;
	int principle=10000;
	
	@Override
	public void recurringDeposit() {
		Double finalamount=principle+(principle*interestrate*tenure);	
		System.out.println("Final amount after tenure is: "+finalamount);
		
	}

	public static void main(String[] args) {
		RBIOne r=new HDFCOne();
		r.recurringDeposit();

	}



}
