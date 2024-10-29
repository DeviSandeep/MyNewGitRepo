package MavenPackage2;

public class Bank {

	public static void main(String[] args) {
		int withdraw=500;
		int balance=200;
		if(withdraw>balance) {
			try {
				throw new MyExceptionClass("Insufficient Balance");
			}
			catch(Exception e){
				System.out.println("Exception Handled");
			}
		}
	}

}
