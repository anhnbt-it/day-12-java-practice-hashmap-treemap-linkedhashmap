import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/20/2020
 * Time: 1:37 PM
 */
public class TestMap {
    public static void main(String[] args) {
        // Test HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "Khoai Tay");
        hashMap.put(2, "Rose");
        hashMap.put(10, "AnhNBT");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        // Test TreeMap
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(30, "Smith");
        linkedHashMap.put(31, "Anderson");
        linkedHashMap.put(29, "Lewis");
        linkedHashMap.put(29, "Cook");
        System.out.println("\nThe age for Lewis is " + linkedHashMap.get("Lewis"));

    }
}
