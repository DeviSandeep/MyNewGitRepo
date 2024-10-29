package MavenPackage1;

public class OverrideClassB extends OverrideClassA {
	@Override
	
	public void run() {
		System.out.println("Child Running");
	}

	public static void main(String[] args) {
		OverrideClassB b=new OverrideClassB();
		

	}

}
