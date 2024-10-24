package MavenPackage2;

public class FinalKeyword extends FinalKeywordParent{
int a=10;
static int b=5;
final int c=9;
public void run() {
	a=30;
	b=15;
	//c=8;
	System.out.println(a);
	System.out.println(b);
}
static {
	System.out.println("Static Block");
}
	public static void main(String[] args) {
		FinalKeyword fk=new FinalKeyword();
		fk.run();
		

	}

}
