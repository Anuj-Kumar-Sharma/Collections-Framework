import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedListUsingList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(); // This will internaly create array of size 0
        list.add(1); // This will internaly create array of size 10 and add 1 at the end of the List.
        list.add(2); // This will add 2 at the end of the List.
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        // This will create internal array of size = current size + (current size / 2) + 1 = 10 + 5 + 1 = 16
        // Copies all the elements from old array to new array of size 16
        list.add(10);  
        
        System.out.println(list); 

//        list.add(1, 50); // This will add 50 at index 1. // All the other elements from index 1 to end will be shifted one step right. // Time complexity will be O(n)
//        System.out.println(list);

/*
        List<Integer> newList = new ArrayList(); // Creating a new List which will be added to original list.
        newList.add(150);
        newList.add(160);

        list.addAll(newList); // This will add all the elements present in newList to list.
        System.out.println(list);
*/

//        System.out.println(list.get(1)); // Will return element at index 1
        
//        list.remove(1);  // This will remove the element at index 1 i.e 20. And left shift all the elements from index 2 to end. Remove() time complexity will be O(n)
//        System.out.println(list);

//        list.remove(Integer.valueOf(30)); // This will remove 30 from the list
//        System.out.println(list);


//        list.clear(); //This will remove all the elements from the list.
//        System.out.println(list);
        
//        list.set(2, 1000); // It will give java.lang.IndexOutOfBoundsException if list is empty or index is larger than size of an List. Time complexity will be O(1)

//        System.out.println(list); // System.out.println() uses .toString() method of List

//        System.out.println(list.contains(500)); // Returns true if 500 is present in the List. Time complexity will be O(n)


/*
        //Iterate over all elements using simple for loop 
        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is " + list.get(i));
        }
*/

/*
        // Iterate over all the elements using for each loop
        for (Integer element: list) {
           System.out.println("foreach element is " + element);
        }
*/

/*
        // Iterate over all the elements using iterator
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next()); // it.next() return the value at current index and jumps to next
        }
*/

    }
}
