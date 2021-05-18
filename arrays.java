
import java.util.*;

// See a detail stuff, at 4:48
// https://youtu.be/04ZxqFHU9OI?list=TLGGP01EvLbTSPMxODA1MjAyMQ
public class arrays {

    public static void fun(int[] arr)
    {
        arr[2] = 30;
        arr[3] = 40;
        // for(int i = 0; i<arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }
    }


    public static void main(String[] args) {
     int[] arr = new int[5];
     arr[0] = 10;
     arr[1] = 20;
     arr[4] = 50;
    //  Array Address is passed automatically.
     fun(arr);
    
    //  New way to print
    // val gets arr[0], arr[1], arr[2]
    for(int val:arr)
    {
        System.out.println(val);
    }
 }
}
