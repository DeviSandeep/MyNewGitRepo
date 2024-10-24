package MavenPackage1;

public class ACWithinClass {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	private void runA() {
		System.out.println("A");
	}
	 void runB() {
		System.out.println("B");
	}
	protected void runC() {
		System.out.println("C");
	}
	public void runD() {
		System.out.println("D");
	}
	public static void main(String[] args) {
		ACWithinClass ac=new ACWithinClass();
		ac.runA();
		ac.runB();
		ac.runC();
		ac.runD();
		System.out.println(ac.a);
		System.out.println(ac.b);
		System.out.println(ac.c);
		System.out.println(ac.d);
		

	}

}
