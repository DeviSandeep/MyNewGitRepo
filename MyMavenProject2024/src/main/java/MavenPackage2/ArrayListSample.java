package MavenPackage2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Selenium");
		al.add("C++");
		System.out.println(al);
		String a=al.get(1);
		System.out.println(a);
		Boolean b=al.contains("Java");
		System.out.println(b);
		int s=al.size();
		System.out.println(s);
		al.remove(2);
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for(String d:al) {
			System.out.println(d);
		}
		int i[]= {3,1,2,4};
		for(int e:i) {
			System.out.println(e);
		}
		
		
		
		
	}

}
