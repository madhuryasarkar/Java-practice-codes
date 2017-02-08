// This is a program that acceps a number and returns the value of it's factorial - n!


public class Factorial {
	
	public void factorial(int number){
		int f=1;
		
		for(int i=1;i<=number;i++){
			f *=i;
		}
		System.out.println(f);
	
}

public static void main(String[] args){
	
	Factorial obj = new Factorial();
	obj.factorial(5);
}
}
