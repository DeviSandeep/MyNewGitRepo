package MavenPackage2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListSetSample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Devi");
		al.add("Priyanka");
		al.add("Jyothika");
		al.add("Devi");
		System.out.println(al);
		String s1=al.get(2);
		System.out.println(s1);
		boolean s2=al.contains("Priyanka");
		System.out.println(s2);
		int s3=al.size();
		System.out.println(s3);
		al.remove(2);
		System.out.println(al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		for(String a:al) {
			System.out.println(a);
		}
		int i[]= {3,5,8,10};
		for(int b:i) {
			System.out.println(b);
		}
		
		HashSet<String> set=new HashSet<String>();
		set.add("Java");
		set.add("Eclipse");
		set.add("GIT");
		set.add("Java");
		System.out.println(set);
		set.remove("GIT");
		System.out.println(set);
		Iterator<String> itr1=set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		for(String c:set) {
			System.out.println(c);
		}
		
		
	}

}
