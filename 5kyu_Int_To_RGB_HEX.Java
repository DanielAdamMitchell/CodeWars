/*
Task
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. 
Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

The following are examples of expected output values:
RgbToHex.rgb(255, 255, 255) // returns FFFFFF
RgbToHex.rgb(255, 255, 300) // returns FFFFFF
RgbToHex.rgb(0, 0, 0)       // returns 000000
RgbToHex.rgb(148, 0, 211)   // returns 9400D3
*/

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
      
      //Round down abnormally large numbers
      if(r > 255) r = 255;
      if(g > 255) g = 255;
      if(b > 255) b = 255;
      
      //Catch Negatives
      if(r < 0) r = 0;
      if(g < 0) g = 0; 
      if(b < 0) b = 0;
        
      //Int to Hex
      String rString = Integer.toHexString(r).toUpperCase();
      String gString = Integer.toHexString(g).toUpperCase();
      String bString = Integer.toHexString(b).toUpperCase();

      //Add Leading 0's
      if(rString.length() == 1) rString = 0 + rString;
      if(gString.length() == 1) gString = 0 + gString;
      if(bString.length() == 1) bString = 0 + bString;
      
      return rString + gString + bString;
    }
}


//Most usefull bits i then learned from other solutions - could also have made a function for the checks

String.format("%02X%02X%02X", r, g, b); or String.format("%02x", r)

private static int fix(int number) {
        if (number < 0) return 0;
        return Math.min(number, 255);
}
