import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(1); // if successfull -> returns true. If unsuccessfull -> returns false
        q1.offer(2);
        
        q1.add(3); // if successfull -> returns true. If unsuccessfull -> throws an exception
        q1.add(4);
        System.out.println(q1);

        System.out.println(q1.poll()); // Returns and removes head of queue. Return null if empty
        System.out.println(q1.remove()); // Returns and removes head of queue. Throws exception if empty
        System.out.println(q1);

        System.out.println(q1.peek()); // Returns head of queue. Return null if empty
        System.out.println(q1.element()); // Returns head of queue. Throws exception if empty
    }
}

/*
Stack    vs.   LinkedList  
Push            offer - add
pop             poll  - remove
peek            peek  - element
*/