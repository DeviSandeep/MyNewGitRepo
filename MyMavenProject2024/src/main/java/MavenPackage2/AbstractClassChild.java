package MavenPackage2;
//child of abstract class
public class AbstractClassChild extends AbstractClass {
	
	@Override
	public void run() {
		System.out.println("Test Run");
	}
		

	public static void main(String[] args) {
		AbstractClass ac=new AbstractClassChild();
		ac.run();
		ac.test();
		//or
		AbstractClassChild cc=new AbstractClassChild();
		cc.run();
		cc.test();
		

	

	
		
	}

}
