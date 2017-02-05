/* Given two strings of lowercase English letters,

For the first line, sum the lengths of A and B. 
For the second line, write Yes if A is lexicographically larger than B or No if it is not. 
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length()+B.length();
        int lex = A.compareTo(B);
        String s1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String s2 = B.substring(0,1).toUpperCase() + B.substring(1);
        
        
        System.out.println(sum);
        if(lex > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(s1+ " "+s2);
        
    }
}
