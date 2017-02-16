/* Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line. */

import java.util.*;


public class stringToken {
	
	public static void main(String[] args){
		String s = "He! is a very very good boy, isn't he?";
		
		StringTokenizer tokens = new StringTokenizer(s, "!,?._'@]+ ");
		
		int count = tokens.countTokens();
		
		System.out.println(count);
		for(int i=0;i<count;i++){
			
			System.out.println(tokens.nextToken());
		}
		
	}

}


