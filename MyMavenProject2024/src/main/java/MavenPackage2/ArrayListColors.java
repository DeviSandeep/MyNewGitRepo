package MavenPackage2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListColors {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Yellow");
		al.add("Green");
		al.add("Black");
		System.out.println("Colors in ArrayList: "+al);
		String s1=al.get(2);
		System.out.println("color at index 2 is: "+s1);
		Iterator<String> itr=al.iterator();
		System.out.println("Iterate through all the elements in array list");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.remove(3);
		System.out.println("Colors in ArrayList: "+al);
		boolean b=al.contains("Blue");
		System.out.println(b);

	}

}
