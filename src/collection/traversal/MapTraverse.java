package collection.traversal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapTraverse {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        // Map<String, Fruit> map = new LinkedHashMap<>();
        // Map<String, Fruit> map = new TreeMap<>();
        // Map<String, Fruit> map = new Hashtable<>();

        // map.put("empty", null);
        map.put("apple", "a1");
        map.put("orange", "a2");

        useKeySet(map);
        useEntrySet(map);
        useForLoop(map);
        useForEachLoop(map);
        useStreamAPI1(map);
        useStreamAPI2(map);
        useValue(map);
    }

    public static void useKeySet(Map<String, String> map) {
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            map.get(key);
        }
    }

    public static void useEntrySet(Map<String, String> map) {
        Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String> mapElement = iterator.next();
            mapElement.getKey();
            mapElement.getValue();
        }
    }

    public static void useForLoop(Map<String, String> map) {
        for (Entry<String, String> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }

    public static void useForEachLoop(Map<String, String> map) {
        map.forEach((key, value) -> {
        });
    }

    public static void useStreamAPI1(Map<String, String> map) {
        map.entrySet().stream().forEach((entry) -> {
            entry.getKey();
            entry.getValue();
        });
    }

    public static void useStreamAPI2(Map<String, String> map) {
        Stream<Entry<String, String>> stream = map.entrySet().stream();
        stream.forEach((entry) -> {
            entry.getKey();
            entry.getValue();
        });
    }

    public static void useValue(Map<String, String> map) {
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
        }
    }

}
