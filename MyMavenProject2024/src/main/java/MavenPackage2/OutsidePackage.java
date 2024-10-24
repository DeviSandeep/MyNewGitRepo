package MavenPackage2;

import MavenPackage1.ACWithinClass;

public class OutsidePackage {

	public static void main(String[] args) {
		ACWithinClass ab=new ACWithinClass();
		ab.runD();
		System.out.println(ab.d);
		

	}

}
