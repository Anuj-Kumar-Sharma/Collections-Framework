import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>(); // Random Order set. all operations in O(1)
//        Set<Integer> set = new LinkedHashSet<>(); // Orignal Order set. all operations in O(1)
        Set<Integer> set = new TreeSet<>(); // Stores in sorted order using BST(Binary Search Tree) + property of set. all operations in O(log(n))

        set.add(32); // Lets say has of 32 = adjadghsb
        set.add(32); // has of 32 = adjadghsb is already there. So no repetetative value will be added.
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
//
        System.out.println(set);
//
        set.remove(54);
        set.remove(3443534); //If element is not present it will not give error
//
        System.out.println(set);
//
        System.out.println(set.contains(21));
//
        System.out.println(set.isEmpty());
//
        System.out.println(set.size());
//
        set.clear();
//
        System.out.println(set);

/*
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        studentSet.add(new Student("Shivam", 3));

        studentSet.add(new Student("Rohit", 2));

        Student s1 = new Student("Anuj", 2);
        Student s2 = new Student("Rohit", 2);

        System.out.println(s1.equals(s2));
        System.out.println(studentSet);
*/

    }
}
