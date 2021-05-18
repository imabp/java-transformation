    /**
     * Point p = new Point();
     * p.x = 10
     * p.y = 10
     * 
     * Lets understand Memory Structure Difference in Java vs CPP  in Java by this problem:
     * 
     * We have point class.
     * 
     * class Point
     * {
     *  int x;
     *  int y;
     * }
     * 
     * We have Rectangle Class
     * 
     * class Rectangle
     * {
     *  Point topleft = new Point();;
     *  Point bottomright = new Point();
     * }
     * 
     * Rectangle rect = new Reactangle
     * rect.topleft.x=10
     * rect.topleft.y=20
     * 
     * rect.bottomright.x = 100
     * rect.bottomright.y = 200
     * 
     * 
     * IN CPP above, structure will be.
       
                   Labels              Memory STACK
            _______________________
            -            _    y   _     -  200  -
            -       bottomRight   _     ---------
            -            _    x   _     -   100 -
          rect           __________     ---------
            -            _    y   _     -   20  -
            -         topleft     _     ---------
            -            _    x   _     -   10  -              
            _______________________     ---------
              
       
       
       
     * In Java, the memory structure will be
                                                                                                          STACK
                             Memory STACK                            STACK                --------> ----------------- 
                            -             -                                               -         -   x   10      -
                            -             -                    -----------------          -         ----------------- 
                            -             -           -------> -  topleft      ------------         -   y   20      -                
                            -             -           -        -  (Address)    -                    -----------------
                            -             -           -        -----------------                                            
                            -             -           -        -  BottomRight  ------------                                        
                            -             -           -        -  (Address)    -          -
                            -             -           -        -----------------          -                     
                            ---------------           -                                   -           
                            -  rect       - -----------                                   -              STACK
                            - address(4k) -                                               -------> -----------------    
                            ---------------                                                        -   x   10      -     
                                                                                                   -----------------          
                                                                                                   -   y   200     -       -        
                                                                                                   -----------------                      
            
     *      
     *      
     *      
     * 
     * 
     * 
     * 
     * 
     * @params
     */
public class oops {

    
    public static void main(String[] args) {
        System.out.println("Please see the file: oops.java to know, memory structure.");
    }

}
