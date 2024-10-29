package MavenPackage1;

public class ChildClassForInterface implements ChildInterface {
	@Override
	public void run() {
		System.out.println("Running");
		
	}
	@Override
	public void Parent1() {
		System.out.println("Parent 1 Interface");
		
	}


	@Override
	public void Parent2() {
		System.out.println("Parent 2 Interface");
		
	}


	public static void main(String[] args) {
		ChildInterface ci=new ChildClassForInterface();
		ci.run();
		ci.Parent1();
		ci.Parent2();

	}





}
