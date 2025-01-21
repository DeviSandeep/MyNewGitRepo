package MavenPackage1;

public class PalindromInteger {
	

	public static int revnum(int num) {
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
	}
		return num;
	}	
		public static boolean isPalindrome(int num)
		{
			return(num==revnum(num));
		}
	public static void main(String[] args) {
		int num=1231;
		if(isPalindrome(num)) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
