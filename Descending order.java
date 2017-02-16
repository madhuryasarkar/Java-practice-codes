// arrange nos in descending order

import java.util.Arrays;
import java.util.*;

public class DescendingOrder {
	
	public static void main(String[] args){
		int[] arr = {1,5, 8, 10, 3, -5, -10};
		 Arrays.sort(arr);
		
		 for(int i=0;i<arr.length/2;i++){
			 int temp = arr[i];
			    arr[i] = arr[arr.length - i - 1];
			    arr[arr.length - i - 1] = temp;
		}
		 
		 for(int j=0;j<arr.length;j++){
			 System.out.println(arr[j]);
		 }
	}
}
