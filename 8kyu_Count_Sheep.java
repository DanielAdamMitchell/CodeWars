/*Task
Consider an array/list of sheep where some sheep may be missing from their place. 
We need a function that counts the number of sheep present in the array (true means present).
Hint: Don't forget to check for bad values like null/undefined
*/

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int count = 0;
    for(int i = 0; i < arrayOfSheeps.length; i++){
      try{
        if(arrayOfSheeps[i]) count += 1;
      }
      catch(Exception e){
        continue;
      }
    }
    return count;
  }
}




//Best solution i then studied from
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int counter = 0;
    for (Boolean present : arrayOfSheeps) {
      if (present != null && present) {
        counter += 1;
      }
    }
    return counter;
  }
}
