package MavenPackage1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Selenium");
		al.add("C++");
		al.add("Java");
		al.add("Manual");
		al.add("JavaScript");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
