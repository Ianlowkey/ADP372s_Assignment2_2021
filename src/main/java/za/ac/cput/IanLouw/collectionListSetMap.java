package za.ac.cput.IanLouw;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class collectionListSetMap {

    public static void main(String[] args) {

        //Instantiating list, set and map

        Collection<String> list = new LinkedList<>();
        Collection<Integer> set = new HashSet<>();
        HashMap <Integer, String> map = new HashMap<>();

        //Adding elements to list
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        //Adding integers to set
        set.add(1);
        set.add(2);
        set.add(3);

        //Adding elements to map
        map.put( 1 , "One");
        map.put( 2 , "Two");
        map.put( 3 , "Three");

        System.out.println("Collection list" + list);
        System.out.println("Collection set" + set);
        System.out.println("Collection map" + map);
    }
}
