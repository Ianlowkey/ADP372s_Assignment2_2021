package za.ac.cput.IanLouw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;


class CollectionListSetTest {

    Collection<String> list = new LinkedList<>();
    Collection<Integer> set = new HashSet<>();

    @BeforeEach
    void setUp() {

        //Adding elements to list
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        //Adding integers to set
        set.add(1);
        set.add(2);
        set.add(3);
    }

    @Test
    @DisplayName("This displays add test for List")
    void testAddList(){
        list.add("Element 4");
        System.out.println(list);
    }

    @Test
    @DisplayName("This displays remove test for List")
    void testRemoveList(){
        System.out.println(list);
        list.remove("Element 2");
        System.out.println(list);
    }

    @Test
    @DisplayName("This displays find test for List")
    void testFindList(){
        //list.add("Element 4");
        System.out.println(list.contains("Element 1"));
    }

    @Test
    @DisplayName("This displays add test for Set")
    void testAddSet(){
        set.add(4);
        System.out.println(set);
    }

    @Test
    @DisplayName("This displays remove test for Set")
    void testRemoveSet(){
        set.remove(2);
        System.out.println(set);
    }

    @Test
    @DisplayName("This displays find test for Set")
    void testFindSet(){
        System.out.println(set.contains(1));
    }
}