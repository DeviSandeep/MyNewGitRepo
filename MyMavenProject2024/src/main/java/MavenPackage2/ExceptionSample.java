package MavenPackage2;

public class ExceptionSample {

	public static void main(String[] args) {
	int a=10,b=20;
	try {
		int c=100/0;
		System.out.println(c);
	}
	catch(Exception e){
		System.out.println("Exception handling"+e);
	}
	finally {
		System.out.println("finally");
	}
	int s=a+b;
	System.out.println(s);
	}

}
