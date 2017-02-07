//Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.


public class AddStrings {
	public void addString(String a, String b){
		
		int no1 = Integer.parseInt(a);
		int no2 = Integer.parseInt(b);
		 int sum = no1 + no2;
		  String s = Integer.toString(sum);
		  
		  System.out.println(s);
		
	}
	
	public static void main(String[] args){
		
	AddStrings obj = new AddStrings();
	obj.addString("10", "88");
		
	}
}
