/*
TASK
Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
It should remove all values from list a, which are present in list b keeping their order.

Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
If a value is present in b, all of its occurrences must be removed from the other:
Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
*/

import java.util.ArrayList;

public class Kata {

  public static int[] arrayDiff(int[] a, int[] b) {
    
    //I used an array list as the size is uncertain and variable
    ArrayList<Integer> myArray = new ArrayList<Integer>();
    
    //Checks if a number in b is present in a and only adds it to my new list if it isnt
    for(int i = 0; i< a.length; i++){
      boolean isPresent = false;
      for(int j = 0; j< b.length; j++){
        if(a[i] == b[j]) isPresent = true;
      }
      if(!isPresent) myArray.add(a[i]);
    }
    
    //Create new array thats the same size - as the code task wants a int[]
    a = new int[myArray.size()];
    
    //Iterates through and copies the list over
    for(int i = 0; i <= myArray.size()-1; i++){
      a[i] = myArray.get(i);
    }
    
    return a;
  }

}


//Others used .stream or a built in utility function
