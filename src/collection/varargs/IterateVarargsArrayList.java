package collection.varargs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateVarargsArrayList {

    public static void main(String[] args) {
        List<String> hashMapObj1 = new ArrayList<>();
        List<String> hashMapObj2 = new ArrayList<>();
        List<String> hashMapObj3 = new ArrayList<>();

        hashMapObj1.add("a1");
        hashMapObj1.add("a2");
        hashMapObj2.add("b1");
        hashMapObj3.add("c1");

        varargsArrayList(hashMapObj1, hashMapObj2, hashMapObj3);
    }

    @SafeVarargs
    public static void varargsArrayList(List<String>... varargsArrayList) {
        for (List<String> eachArrayList : varargsArrayList) {
            Iterator<String> iterator = eachArrayList.iterator();
            while (iterator.hasNext()) {
                String string = iterator.next();
                System.out.println(string);
            }
        }
    }

}
