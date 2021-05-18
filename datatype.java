public class datatype {
    // Data Type Total 8
    /**
     * "All are signed, there is no unsigned in Java"
     * ------------------------------------------------------ 
     * DATATYPE, RANGE,  SIZE
     * 
     * byte, -2^7 to (2^7) - 1,  1 byte 
     * short,  -2^15 to (2^15) - 1,  2 byte 
     * int,  -2^31 to (2^31) - 1,  4 byte 
     * long,  -2^63 to (2^63) - 1,  8 byte
     * 
     * char, 0 to (2^64) -1, 2 byte 
     * float, , 4 byte 
     * double (default), , 8 byte
     * boolean,true/false, 
     * -------------------------------------------------------
     */



    /**
     * Swapping will not work
     * public static void swapNOREFERENCE(int a, int b){ 
     * int temp = a; 
     * a = b; 
     * b =temp; 
     * }
     */

    public static void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    static int a = 10;
    static int b = 20;

    public static void main(String[] args) {

        // "swapNOREFERENCE(a,b)"
        // Swapping Wont Work, as Java dont have pointers, we cannot
        // pass reference to memory.
        // Therefore we have to declare them as static, in global.
        swap();
    }

}
