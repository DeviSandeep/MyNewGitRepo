package MavenPackage2;

import MavenPackage1.ACWithinClass;

public class AcOutsidePacWithinCla extends ACWithinClass {

	public static void main(String[] args) {
		 AcOutsidePacWithinCla al=new  AcOutsidePacWithinCla();
		 al.runC();
		 al.runD();
		 System.out.println(al.c);
		 System.out.println(al.d);

	}

}
