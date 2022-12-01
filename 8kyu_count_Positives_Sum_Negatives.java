/*
TASK
Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
If the input is an empty array or is null, return an empty array.
*/

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
      int posCount = 0;
      int negCount = 0;
      if(input != null){
        for(int myInt : input){
          if(myInt > 0){
            posCount += 1;
          }else if (myInt < 0) {
            negCount += myInt;
          }
        }
      }
  
      if(posCount == 0 && negCount == 0){
        int[] myArray = new int[0];
        return myArray;
      }
      else{
        int[] myArray = {posCount,negCount};
        return myArray;
      }
    }
}


//I knew this wasnt efficient when i made it, after learning from others i made:

public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
       if (input == null || input.length == 0) return new int[] {};
       int posCount = 0, negSum = 0;
       for (int i : input) {
         if (i > 0) posCount ++;
         else if (i < 0) negSum += i;
       }
       return new int[] {posCount,negSum};
    }
}


