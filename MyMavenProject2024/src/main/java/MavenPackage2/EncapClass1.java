package MavenPackage2;

public class EncapClass1 {
	private String username;
	private String password;

	public void setDetails(String u,String p) {
		username=u;
		password=p;
	}
	
	public void getDetails() {
		System.out.println("Username is:"+username);
		System.out.println("Username is:"+password);
	}
	public static void main(String[] args) {
		

	}

}
