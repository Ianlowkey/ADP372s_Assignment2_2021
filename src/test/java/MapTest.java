import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    HashMap<String, String> map = new HashMap<>();

    @BeforeEach
    void setUp() {
        map.put("IanLouw", "216250773");
        map.put("MadeUp","123456789");
    }

    @Test
    @DisplayName("This displays add test")
    void testAdd(){
        map.put("testAdd", "add123");
        System.out.println(map);
    }

    @Test
    @DisplayName("This displays the remove test")
    void testRemove(){
        map.remove("MadeUp");
        System.out.println(map);
    }

    @Test
    @DisplayName("This displays the find test")
    void testFind(){
        //map.containsKey("IanLouw");
        System.out.println(map.containsKey("IanLouw"));
    }
}