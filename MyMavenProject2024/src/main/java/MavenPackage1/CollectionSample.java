package MavenPackage1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Devi");
		al.add("Priyanka");
		al.add("Jo");
		al.add("Bula");
		System.out.println(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
