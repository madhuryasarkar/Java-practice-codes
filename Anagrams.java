//Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. 

import java.io.*;
import java.util.*;

public class Solution {
        static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        
        if(a.length() != b.length()){
            return false;
        }
        
        
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        int[] fin = new int[256];
        
        
        for(int i=0;i<arr1.length;i++){
            fin[arr1[i]]++;
            fin[arr2[i]]--;
        }
        
        for(int j=0;j<arr1.length;j++){
            if(fin[arr1[j]]!=0) return false;
        } return true;
        
       
        
    }
    
     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
