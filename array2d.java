public class array2d {
/**
 * 
 * 
 * ----------------------------------------------------------------------------------------------------------- 
 * 2D ARRAY
 * 
 * int[][] arr = new int[2][3]; means 2 rows, 3 columns  
 * This will work something like this
 *  
 * arr            It points to                               
 * is a           the address of number of rows 
 * 2d array       you can think it as arr[0] will
 *                point to address 4k 
 * 
 * 
 *        STACK                                                      HEAP
 *       --------                   
 *       -      -           -------------------           
 *       -      -           -   -             -                      ----------------------------  
 *       -      -     ----> - 0  - address 4k - -------------------> - [0][0] - [0][1] - [0][2] -     
 *       -      -     -     -   -             -                      ----------------------------     
 *       -      -     -     -------------------
 *       -      -     -     -   -             -                      ----------------------------  
 *       --------     -     - 1 - address 5k  - -------------------> - [1][0] - [1][1] - [2][2] -  
 *       - arr  -------     -   -             -                      ----------------------------  
 *       --------           -------------------
 * 
 * 
 * 
 * -----------------------------------------------------------------------------------------------------------
 * 2D JAGGED ARRAY 
 * 
 * We can take advantage of this.
 * by doing something like this
 * 
 * int[][] jagArr = new int[2][];
 * 
 * This will result in this.
 * 
 *          STACK                                              
 *      --------                   
 *      -      -           -------------------           
 *      -      -           -   -             - 
 *      -      -     ----> - 0  -  null      - 
 *      -      -     -     -   -             -   
 *      -      -     -     -------------------
 *      -      -     -     -   -             - 
 *      --------     -     - 1 -   null      - 
 *      - arr  -------     -   -             -
 *      --------           -------------------
 * 
 *
 *  We can have dynamic sizes, in the array. 
 * Like, 0th index, having an array of size 4
 * Like, 1st index, having an array of size 6
 * 
 * jagArr[0] = new int[4];
 * jagArr[1] = new int[6];
 * 
 * Above assignments will result in this 
 * 
 *      --------                   
 *      -      -           -------------------           
 *      -      -           -   -             -                      -------------------------------------  
 *      -      -     ----> - 0  - address 4k - -------------------> - [0][0] - [0][1] - [0][2] - [0][3] -       
 *      -      -     -     -   -             -                      -------------------------------------     
 *      -      -     -     -------------------
 *      -      -     -     -   -             -                      -------------------------------------------------------  
 *      --------     -     - 1 - address 5k  - -------------------> - [1][0] - [1][1] - [1][2] - [1][3] - [1][4] - [1][5] - 
 *      - arr  - -----     -   -             -                      -------------------------------------------------------  
 *      --------           -------------------
 * 
 * 
 * Lets Implement both, a 2d array and a 2d-Jagged Array. 
 * @param args
 */

 public static void display(int[][] arr)
 {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
    }
    System.out.println("\n");
 }


 public static void main(String[] args) {
     
    int[][] arr = new int[2][3];

    arr[0][0] = 10;
    arr[0][1] = 20;
    arr[0][2] = 30;

    arr[1][0] = 40;
    arr[1][1] = 50;
    arr[1][2] = 60;

    display(arr);


    int[][] jagArr = new int[2][];
    jagArr[0] = new int[4];
    jagArr[1] = new int[6];

    for (int i = 0; i < jagArr.length; i++) {
        for (int j = 0; j < jagArr[i].length; j++) {
            jagArr[i][j] = i+j;
            System.out.println("Value of i: "+i + " Value of j: "+j);
        }
    }

    display(jagArr);
}
}
