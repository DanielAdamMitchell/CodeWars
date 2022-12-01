/*
TASK
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should 
replace the missing second character of the final pair with an underscore ('_').

Examples:
* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
*/


//As of creating this i dont think the divide by 2 logic was the simplest way for the length of the string

public class StringSplit {
    public static String[] solution(String s) {
      String[] charArray = s.split("");
     
      if(s == null || s.isEmpty()) return new String[0];
      
      String[] stringArray = new String[(int) Math.ceil((double)charArray.length / 2)];
      
      for(int i = 0; i < charArray.length; i++){
        if(i % 2 == 0) stringArray[i/2] = charArray[i];
        else if(i % 2 == 1) stringArray[i/2] += charArray[i];
      }
      if(charArray.length % 2 == 1) stringArray[stringArray.length - 1] += '_';

      return stringArray;
    }
}
