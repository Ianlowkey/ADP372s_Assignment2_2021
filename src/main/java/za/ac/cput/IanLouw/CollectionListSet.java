package za.ac.cput.IanLouw;


import java.util.*;

public class CollectionListSet {

    public static void main(String[] args) {

        //Instantiating list and set

        Collection<String> list = new LinkedList<>();
        Collection<Integer> set = new HashSet<>();

        //Adding elements to list
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        //Adding integers to set
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("Collection list" + list);
        System.out.println("Collection set" + set);

    }

}
