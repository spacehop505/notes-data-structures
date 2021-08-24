package collection.methods;

import java.util.*;

public class SameMethods {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        listMethods(list);

        Queue<String> queue = new LinkedList<>();
        queueMethods(queue);

        Deque<String> deque = new ArrayDeque<>();
        dequeMethods(deque);

        Map<String, String> map = new HashMap<>();
        mapMethods(map);

        Stack<Integer> stack = new Stack<>();
        stackMethods(stack);

        int[] intArray = {1, 2};
        arrayMethods(intArray);
    }

    public static void arrayMethods( int[] intArray){
        String[] stringArray = {"hello", "abc"};
        char[] charArray = stringArray[0].toCharArray();

        System.out.println("Print Arrays.toString(): " + Arrays.toString(charArray));
        System.out.println("Print Arrays.toString(): " + Arrays.toString(intArray));
        System.out.println("Print Arrays.toString(): " + Arrays.toString(stringArray));

        System.out.println("Array Length: " + intArray.length);
        System.out.println("Array Length: " + stringArray.length);
        System.out.println("Index 0 equals('hello'): " + stringArray[0].equals("hello"));
        System.out.println("Index 0 equals('bob'):\t " + stringArray[0].equals("bob"));
        System.out.println("Index 0 == 'hello':\t " + (stringArray[0] == "hello"));
        System.out.println("Index 0 == 'bob':\t " + (stringArray[0] == "bob"));
        System.out.println("Char Index charAt(0):\t " + stringArray[0].charAt(0));
        System.out.println("Word Length():\t " + stringArray[0].length());
        System.out.println("hashCode():\t " + stringArray[0].hashCode());
    }

    public static void mapMethods(Map<String, String> map) {
        // map.put("empty", null);
        map.put("apple", "aaa");
        map.put("orange", "ggggg");

        System.out.println("containsKey():\t" + map.containsKey("apple"));
        System.out.println("containsValue():" + map.containsValue("aaa"));
        System.out.println("size():" + map.size());
        System.out.println("containsValue():" + map.containsValue("aaa"));
        System.out.println("containsValue():" + map.containsValue("aaa"));
    }


    public static void listMethods(List<String> list) {
        //	Set<String> list = new HashSet<>();
        Deque<String> deque = new ArrayDeque<>();
        list.add("HELLO");
        list.add("GGGGG");
        list.add("WEW");

        System.out.println("size():\t\t" + list.size());
        System.out.println("isEmpty():\t" + list.isEmpty());
        System.out.println("toString():\t" + list.toString());
        System.out.println("hashCode():\t" + list.hashCode());
        System.out.println("contains():\t" + list.contains("HELLO"));
        System.out.println("set():\t\t" + list.set(0, "OOOOOO"));
        System.out.println("get().equals():\t" + list.get(0).equals("OOOOOO"));
        System.out.println("remove():\t" + list.remove("OOOOOO"));
        System.out.println("subList():\t" + list.subList(1, 4));
        System.out.println("getClass():\t" + list.getClass());
        System.out.println("getClass():\t" + list.indexOf("CC"));
        System.out.println("get():\t\t" + list.get(3));
        System.out.println("equals():\t" + list.equals(list));
    }

    public static void stackMethods(Stack<Integer> stack) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
    }

    public static void queueMethods(Queue<String> queue) {
        queue.add("a4");
        queue.add("a5");
        queue.add("a6");
        queue.offer("a7");

        System.out.println("peek():\t\t" + queue.peek());
        System.out.println("element():\t" + queue.element());
        System.out.println("poll():\t\t" + queue.poll());
        System.out.println("remove():\t" + queue.remove());
        System.out.println("size():\t\t" + queue.size());
        System.out.println("isEmpty():\t" + queue.isEmpty());
        System.out.println("toString():\t" + queue.toString());
        System.out.println("hashCode():\t" + queue.hashCode());
        System.out.println("contains():\t" + queue.contains("a6"));
        System.out.println("remove():\t" + queue.remove("a6"));
        System.out.println("getClass():\t" + queue.getClass());
        System.out.println("equals():\t" + queue.equals(queue));

    }

    public static void dequeMethods(Deque<String> deque) {
        deque.add("a1");
        deque.add("a2");
        deque.offer("a7");
        deque.addFirst("AA1");
        deque.addLast("VVVV");
        deque.offerFirst("AAAA");
        deque.offerLast("CCC");

        System.out.println("element():\t" + deque.element());
        System.out.println("peek():\t\t" + deque.peek());
        System.out.println("peekFirst():\t" + deque.peekFirst());
        System.out.println("getFirst():\t" + deque.getFirst());
        System.out.println("peekLast():\t" + deque.peekLast());
        System.out.println("getLast():\t" + deque.getLast());
        System.out.println("poll():\t\t" + deque.poll());
        System.out.println("remove():\t" + deque.remove());
        System.out.println("size():\t\t" + deque.size());
        System.out.println("isEmpty():\t" + deque.isEmpty());
        System.out.println("toString():\t" + deque.toString());
        System.out.println("hashCode():\t" + deque.hashCode());
        System.out.println("contains():\t" + deque.contains("a6"));
        System.out.println("remove():\t" + deque.remove("a6"));
        System.out.println("getClass():\t" + deque.getClass());
        System.out.println("equals():\t" + deque.equals(deque));
    }

}
