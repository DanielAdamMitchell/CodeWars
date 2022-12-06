/*
TASK
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]

For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.
NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
*/


//This was quite challenging but very enjoyable
//I definitely ended up with too many counter variable which i may come back to to make more efficient in the future

import java.util.Arrays;
import java.lang.Math;

public class Snail {

    public static int[] snail(int[][] array) {
    
      if(array == null || array.length == 0 || array[0].length == 0) return new int[0];
      
      int[] snailOutput = new int[(int)Math.pow(array.length,2)];
      int rotation = 1; //1 is right
      int row = 0;
      int column = 0;
      int topRowsDone = 0;
      int bottomRowsDone = 0;
      int rightColsDone = 0;
      int leftColsDone = 0;
      int arrayPosition = 0;
      int sideSize = array.length; //Will be the same regardless of direction

      while(snailOutput[snailOutput.length - 1] == 0){
        
        //RIGHT
        if(rotation % 4 == 1){
          for(int i = column; i < sideSize - rightColsDone; i++){
            snailOutput[arrayPosition] += array[row][i];
            column = i;
            arrayPosition++;
          }
          rotation++;
          topRowsDone++;
          row++;
        }

          //DOWN
        else if(rotation % 4 == 2){
          for(int i = row; i < sideSize - bottomRowsDone; i++){ //1 < 3
            snailOutput[arrayPosition] += array[i][column];
            row = i;
            arrayPosition++;
          }
          rotation++;
          rightColsDone++;
          column--;
        }

          //LEFT
        else if(rotation % 4 == 3){
          for(int i = column; i >= leftColsDone; i--){ //1< 3 - 0
            snailOutput[arrayPosition] += array[row][i];
            column = i;
            arrayPosition++;
            System.out.println("column:" + column);
          }
          rotation++;
          bottomRowsDone++;
          row--;
        }

          //UP 
          else if(rotation % 4 == 0){
            for(int i = row; i >= topRowsDone; i--){
              snailOutput[arrayPosition] += array[i][column];
              row = i;
              arrayPosition++;
            }
            rotation++;
            leftColsDone++;
            column++;
          }

      }//While
    return snailOutput;
   }//Function 
}//Class
