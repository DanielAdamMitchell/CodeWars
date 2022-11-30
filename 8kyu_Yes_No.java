//Task
//Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    if(b == true){
      return "Yes";
    }
    return "No";
  }
  
}




//What i learnt from this

class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    return b ? "Yes" : "No"; //Quick way to implement an if statement in a return statement
  }
}
