
/**How to read user input in Java */

import java.util.*;

public class input {
  public static void main(String[] argv) {
    // We need to have scanner object, which helps to read user data.
    Scanner scn = new Scanner(System.in);
    // Integer Inputs
    int x = scn.nextInt();
    // Output
    System.out.println("Your Input was: " + x); // After printing, it moves the cursor to next line
    System.out.print("HelloWorld");

    // String Inputs
    String s = scn.nextLine();
    System.out.println(s); // nextLine gives everything including space
    // If input was abc def, then output will be abc def

    // If input was abc def
    String s2 = scn.next();
    System.out.println(s2); // Only till, first space
    // then output here will be abc.

    s2 = scn.next(); // Will print the next word, after the space
    // Output will be def
    System.out.println(s2);

    // for, while, do while, break, continue
    // if, else,if-else,switch
  }
}