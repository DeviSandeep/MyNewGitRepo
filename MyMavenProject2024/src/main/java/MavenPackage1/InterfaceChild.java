package MavenPackage1;

public class InterfaceChild implements InterfaceSample {
	
	@Override
	public void run() {
	System.out.println("Running - Abstract");
		
	}

	@Override
	public void employee() {
		System.out.println("Name: Devi");	
		System.out.println("ID: 37982");
		
	}
		
	public static void main(String[] args) {
		InterfaceSample is=new InterfaceChild();
		is.run();
		is.employee();
	

	}





	



}
