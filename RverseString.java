// given a string s , reverse it and print it.


public class ReverseString {
	
	public void reverse(String s){
		String rev = new StringBuilder(s).reverse().toString();
		System.out.println(rev);
	}
	
	public static void main(String[] args){
		ReverseString obj = new ReverseString();
		obj.reverse("Hello World");
	}
	
}
