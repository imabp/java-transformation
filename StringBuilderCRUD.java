/*
StringBuilder is used to overcome the mutability of Java String Class, and has lot of benefits
This file covers all the basic init, update,insert,delete, append functions of StringBuilder Class
*/
import java.util.*;
public class StringBuilderCRUD{

  public static void main(String args[])
  {
    StringBuilder sb = new StringBuilder("helloworld"); //this initializes and declares the stringbuilder
    
    // to get character.
    sb.charAt(0);

    // to insert char at index 2 -> Output: heylloworld (Note: Rest things shift, to next index, and overall length increases);
    sb.insert(2,'y');
    
    // to delete char at index 2 -> Output: helloworld
    sb.deleteCharAt(2); 
    
    // to update char or replace the character at index 2. -> Output: heslworld
    sb.setCharAt(2,'s'); 
    
    // to append at end
    sb.append('g');
  }
}
