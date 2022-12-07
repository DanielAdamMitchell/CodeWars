/*
TASK
Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.
The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.

It is much easier to understand with an example:
* For seconds = 62, your function should return 
    "1 minute and 2 seconds"
* For seconds = 3662, your function should return
    "1 hour, 1 minute and 2 seconds"
For the purpose of this Kata, a year is 365 days and a day is 24 hours.

Note that spaces are important.
*/

import java.util.ArrayList;

public class TimeFormatter {
   
    final static int year = 31536000;
    final static int day = 86400;
    final static int hour = 3600;
    final static int minute = 60;
  
    public static String formatDuration(int seconds) {

      if(seconds == 0) return "now";
      
      ArrayList<String> arraylistInts = new ArrayList<String>();
      int tempCalc = 0;
      
      //Could make this a function
      
      if(seconds >= year){
        tempCalc = (seconds - (seconds % year)) / year;
        arraylistInts.add(tempCalc + " year");
        seconds = (seconds % year);
        if (tempCalc > 1) arraylistInts.set(arraylistInts.size()-1,arraylistInts.get(arraylistInts.size()-1) + "s");
      }
      if(seconds >= day){
        tempCalc = (seconds - (seconds % day)) / day;
        arraylistInts.add(tempCalc + " day");
        seconds = (seconds % day);
        if (tempCalc > 1) arraylistInts.set(arraylistInts.size()-1,arraylistInts.get(arraylistInts.size()-1) + "s");
      }
      if(seconds >= hour){
        tempCalc = (seconds - (seconds % hour)) / hour;
        arraylistInts.add(tempCalc + " hour");
        seconds = (seconds % hour);
        if (tempCalc > 1) arraylistInts.set(arraylistInts.size()-1,arraylistInts.get(arraylistInts.size()-1) + "s");
      }
      if(seconds >= minute){
        tempCalc = (seconds - (seconds % minute)) / minute;
        arraylistInts.add(tempCalc + " minute");
        seconds = (seconds % minute);
        if (tempCalc > 1) arraylistInts.set(arraylistInts.size()-1,arraylistInts.get(arraylistInts.size()-1) + "s");
      }
      if(seconds > 0){
        arraylistInts.add(seconds + " second");
        if (seconds > 1) arraylistInts.set(arraylistInts.size()-1,arraylistInts.get(arraylistInts.size()-1) + "s");
      }

      String result = "";
      
      if(arraylistInts.size() == 1) return arraylistInts.get(0);
      if(arraylistInts.size() == 2) return arraylistInts.get(0) + " and " + arraylistInts.get(1);
      
      if(arraylistInts.size() > 2){
        for(int place = 0; place < arraylistInts.size()-2; place++){
          result += arraylistInts.get(place) + ", ";
        }
      }
      result += arraylistInts.get(arraylistInts.size()-2) + " and ";
      result += arraylistInts.get(arraylistInts.size()-1);

      return result;
      
    }
}
