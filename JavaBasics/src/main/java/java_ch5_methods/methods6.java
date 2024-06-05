package java_ch5_methods;
/* 
    Challenge 2, we're going to create a method, that takes time, represented in seconds, as the parameter.
    We'll then want to transform the seconds into hours. 

    Next we'll display the time in hours, with the remaining minutes and seconds, in a String.
    We'll do this transformation in two steps, which allows us to use overloaded methods.

    We want to create two methods with the same name:  getDurationString
    1. The first method has one parameter of type int, named seconds.
    2. The second method has two parameters, named minutes and seconds, both ints.
    
    Both methods return a String in the format shown: ‘XXh YYm ZZs’ where XX represents the number of hours, 
    YY the number of minutes, and ZZ the number of seconds.
    The first method should in turn call the second method to return its results.
*/


public class methods6 {
    public static String getDurationString(int seconds){
        int min = seconds/60; // given seconds to minutes
        return getDurationString(min, seconds);

    }
    public static String getDurationString(int minutes, int seconds){
        int hr = minutes/60; // given seconds to hr via min

        int remainingMinutes = minutes%60;  // 2%60 is 2/60 --> 60) 2 ( 0       
        //                                                      0
        //                                                      2  --> remainder is 2, so 2%60 is 2
        int remainingseconds = seconds%60;
        return hr + " hr " + remainingMinutes + " min "+ remainingseconds + " sec " ;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(120));
        System.out.println(getDurationString(65, 45));
    }




}
