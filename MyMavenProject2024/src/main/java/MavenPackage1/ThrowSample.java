package MavenPackage1;

public class ThrowSample {
	
	public void printDetail() throws ArithmeticException {
		int a=200/0;
		System.out.println(a);
		throw new ArithmeticException();
		}

	public static void main(String[] args) {
		ThrowSample ts=new ThrowSample();
		try {
			ts.printDetail();
		}
		catch(Exception e) {
			System.out.println("Ëxception Handled");
		}
		
	}

}
