package collection.traversal;

import java.util.*;
import java.util.stream.Stream;

public class SameTraverse {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // List<String> list = new Vector<>();
        // List<String> list = new LinkedList<>();
        //LinkedList<String> list = new LinkedList<>();
        //List<String> list = new Stack<>();
        //Deque<String> list = new ArrayDeque<>();
        //Set<String> list = new HashSet<>();
        // Queue<String> list = new LinkedList<>();

        list.add("a1");
        list.add("a2");
        list.add("a3");

        useIterator(list);
        useForLoop(list);
        useForLoopClassic(list);
        useForEachLoop(list);
        useStreamAPI(list);
    }

    public static void useForLoopClassic(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static void useIterator(List<String> list) {
        //ListIterator<String> iterator = list.listIterator();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
        }
    }

    public static void useForLoop(List<String> list) {
        for (String word : list) {
        }
    }

    public static void useForEachLoop(List<String> list) {
        list.forEach((word) -> {
        });
    }

    public static void useStreamAPI(List<String> list) {
        Stream<String> stream = list.stream();
        stream.forEach((word) -> {
        });
    }

}
