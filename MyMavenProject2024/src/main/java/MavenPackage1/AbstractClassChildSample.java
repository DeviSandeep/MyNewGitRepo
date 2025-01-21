package MavenPackage1;

public class AbstractClassChildSample extends AbstractClassSample {
	
	@Override
	public void run() {
		System.out.println("Running");
		
	}

	public static void main(String[] args) {
		AbstractClassSample ac= new AbstractClassChildSample();
		ac.test();
		ac.run();
		}


}
