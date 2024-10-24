package MavenPackage1;

public class B extends A {
	String college="MBCET";
	
	public void test() {
		System.out.println("Testing");
	}

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
		b.run();
	

	}

}
