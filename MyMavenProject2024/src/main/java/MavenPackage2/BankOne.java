package MavenPackage2;

public class BankOne {

	public static void main(String[] args) {
		int withdraw=500;
		int balance=200;
		if(withdraw>balance) {
			try {
				throw new MyExceptionClassOne();
			}
			catch(Exception e){
				System.out.println("Exception Handled");
			}
		}
	}


	}

