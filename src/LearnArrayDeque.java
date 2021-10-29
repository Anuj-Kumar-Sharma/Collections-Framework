import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); //Same as normal Queue
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek()); //Same as normal Queue
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll()); //Same as normal Queue
        System.out.println("poll() " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " +adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " +adq);

    }

}
