package MavenPackage2;

public class ThrowThrowsSample {
	
	public void print02() throws ArithmeticException{
		print01();
	}
	public void print01() throws ArithmeticException {
		int c=100/0;
		System.out.println(c);
		throw new ArithmeticException();
	}
	

	public static void main(String[] args) {
		ThrowThrowsSample ts=new ThrowThrowsSample();
		try {
		ts.print02();
		}
		catch(Exception e) {
			System.out.println("Exception Handling");
		}
	}

}
