//Checking if a number is prime using bigIntegers

import java.util.*;
import java.math.*;

public class isPrime {
	public static void main(String[] args){
		
			BigInteger b1 = new BigInteger("10");
			
			Boolean b = b1.isProbablePrime(1);
			
			if(b == true){
				System.out.println("prime");
			} else System.out.println("not prime");
			
	}
}
