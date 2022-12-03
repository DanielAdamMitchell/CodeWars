/*
TASK
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/

import java.util.Arrays;

public class Kata {
  public static int[] digitize(long n) {
    String number = String.valueOf(n);
    int[] reverseArray = new int[number.length()];
    char[] splitCharacters = number.toCharArray();
    if(number == null || number.length() == 0) return new int[0];
    
    for(int i = 0; i < number.length(); i++){
      reverseArray[number.length() - i - 1] = Character.getNumericValue(splitCharacters[i]);
    }

    return reverseArray;
  }
}
