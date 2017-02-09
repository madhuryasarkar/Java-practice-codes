/*Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.*/


public class Solution {
  public int[] plusOne(int[] digits) {
	int len = digits.length;
 
	for (int i = len - 1; i >= 0; --i) {
			if (digits[i] == 9) {
				digits[i] = 0;
			} else {
				++digits[i];
				return digits;
			}
       }
       //we have to add a digit at the head
	int[] y = new int[len + 1];
	y[0] = 1;
	for (int j = 1; j <= len; ++j) {
		y[j] = digits[j - 1];
	}
	return y;
}
}
