/*
TASK
You have some 2*2 matrices, each matrix is represented by an array of length 4.
such as [a, b, c, d] is matrix

a b
c d

Matrix can be rotated:

a b   90 degrees  c a  180 degrees  d c  270 degrees  b d
c d  -----------> d b  -----------> b a  -----------> a c

If matrix A can be obtained by rotating matrix B clockwise by 0, 90, 180 or 270 degrees, we think that A and B are the same matrix.
The task of this kata is to count how many different matrices you have.

Notes

The values of the elements of the matrix are at [1, 9], and the number of matrices will not exceed 1000.

*/

import java.util.Arrays;
import java.util.ArrayList;

public class Solution {
  static public int count_different_matrices(int[][] matrices) {
    
    ArrayList<Integer> checkList = new ArrayList<Integer>();
    checkList.add(0); //Start with first array
    Boolean isCheck;
    int[] arrayToCheck;
    for(int i = 1; i < matrices.length; i++){
      arrayToCheck = matrices[i];
      isCheck = true;
      
      for(int j = 0; j < checkList.size(); j++){
        int check = checkList.get(j);
        if(Arrays.equals(matrices[check], arrayToCheck) || Arrays.equals(matrices[check], rotateArray(arrayToCheck,1)) || Arrays.equals(matrices[check], rotateArray(arrayToCheck,2)) || Arrays.equals(matrices[check], rotateArray(arrayToCheck,3))){
           isCheck = false; //If any of the checks are true then the given int[] array is not unique
        }
      }

      if(isCheck) checkList.add(i); 
    }
    
    return checkList.size();
  }
  
  static public int[] rotateArray(int[] inputArray, int rotates){
    for(int i = 0; i < rotates; i++){
      int[] tempArray = {inputArray[2],inputArray[0],inputArray[3],inputArray[1]};
      inputArray = tempArray;
    }
    return inputArray;
  }
  
}
