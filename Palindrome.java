// Print true if a given string s is a palindrome and false if it isn't;


public class Palindrome {
	
	public void palindrome(String s){
		String s1 = s.toLowerCase();
		String rev = new StringBuilder(s1).reverse().toString();
		if(s1.equals(rev)){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args){
		Palindrome obj = new Palindrome();
		obj.palindrome("akkA");
	}
}
