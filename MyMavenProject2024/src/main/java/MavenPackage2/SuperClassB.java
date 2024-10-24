package MavenPackage2;

public class SuperClassB extends SuperClassA {
String colour="Black";
public SuperClassB() {
	super();
	System.out.println("Constructor - Child");
}
public void run() {
	System.out.println("Run-Child");
	System.out.println("Hello");
	
	
	}
public void display() {
	System.out.println(colour);
	System.out.println(super.colour);
	run();
	super.run();
	
}
	public static void main(String[] args) {
		SuperClassB sb=new SuperClassB();
		sb.display();

	}

}
