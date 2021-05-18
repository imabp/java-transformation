import java.util.*;

public class arraylist {
    /**
     * Arraylist is like vectors in CPP Array list has dynamic size Same performance
     * as array
     */
    public static void display(ArrayList<Integer> list) {
        System.out.println(list + " -> " + list.size());

       
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        display(list); // Output: [10,20,30] -> 0

        // .add(value): Adds to the back
        list.add(10);
        list.add(20);
        list.add(30);

        display(list); // Output: [10,20,30] -> 3

        // .add(index, value): Adds based on index and shift rest to right
        list.add(1, 40); /// add(index, value)

        display(list);// Output: [10,40, 20,30] -> 4

        // .set(index,value) : Update based on Index using
        list.set(1, 30);
        // Not Applicable: List[1] = 40 (Incorrect)

        display(list); // Output: [10,30,20,30] -> 4

        // .get(index) gets value based on index
        int val = list.get(1);
        System.out.println(val);
        // Output: 30

        // .remove(index) removes value based on index.
        list.remove(1);
        display(list); // Output: [10,20,30] -> 3

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("World");
        l2.add("!");
        System.out.println(l2 + " -> " + l2.size());

        // To loop the ArrayList
        for(int val1: list)
        {
            System.out.println(val1);
        }
        // To directly print the ArrayList, NOTE: It will print in square brackets.
        System.out.println(list);
    }
}
