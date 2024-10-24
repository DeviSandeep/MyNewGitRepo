package MavenPackage2;

public class MultipleInterfaceClass implements  MultipleInterface1, MultipleInterface2 {
	@Override
	public void run() {
		System.out.println("Running");
		
	}

	public static void main(String[] args) {
		
		MultipleInterface1 m1=new MultipleInterfaceClass();
		m1.run();
		m1.multipleInterface1();
		//or
		MultipleInterface2 m2=new MultipleInterfaceClass();
		m2.run();
		m2.multipleInterface2();
		//or
		MultipleInterfaceClass cc=new MultipleInterfaceClass();
		cc.run();
		cc.multipleInterface1();
		cc.multipleInterface2();

	}

	@Override
	public void multipleInterface2() {
		System.out.println("Interface 2");
		
	}

	@Override
	public void multipleInterface1() {
		System.out.println("Interface 1");
		
	}



}
