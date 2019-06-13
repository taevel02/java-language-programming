package org.dimigo.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        // 2. Map 계열 : HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("korean", 100);
        map.put("math", 90);
        map.put("english", 80);
        printMap(map);

        System.out.println(map.get("korean"));
        System.out.println(map.get("math"));

        map.remove("korean");
        printMap(map);

        map.clear();
        printMap(map);

        // Map : key(String), value(ListString)
        Map<String, List<String>> map2 = new HashMap<>();

        // List : Map<String, String>
        List<Map<String, String>> list = new ArrayList<>();
    }

    private static void printMap(Map<String, Integer> map) {
        for (String key: map.keySet()) {
            System.out.print(key + ":" + map.get(key) + " | ");
        }
    }
}
