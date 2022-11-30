//TASK
//Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

public class GrassHopper {

    public static int summation(int n) {
        int count = 0;
      
        for(int i = 1; i <= n; i++){
          count += i;
        }
        
        return count;
    }
}




//Maths way i found later:

public class GrassHopper {

    public static int summation(int n) {

        return  n*(n+1)/2;
    }
}
