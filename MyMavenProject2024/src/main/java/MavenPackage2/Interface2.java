package MavenPackage2;
//child of interface
public class Interface2 implements Interface1{
	@Override
	public void run() {
		System.out.println("Running");
		
	}

	public static void main(String[] args) {
		Interface1 i=new Interface2();
		i.run();

	}



}
