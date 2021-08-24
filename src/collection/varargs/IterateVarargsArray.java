package collection.varargs;

public class IterateVarargsArray {

    public static void main(String[] args) {
        varargsInt(3, 4, 5);

        int[] numbersObj1 = {1, 2, 3, 4, 5};
        int[] numbersObj2 = {3, 4, 5};
        int[] numbersObj3 = {4, 5};
        varargsArrays(numbersObj1, numbersObj2, numbersObj3);
    }

    public static void varargsInt(int... varargsInt) {
        for (int number : varargsInt) {
            System.out.println(number);
        }
    }

    public static void varargsArrays(int[]... varargsArrays) {
        for (int[] eachArray : varargsArrays) {
            System.out.println("");
            for (int number : eachArray) {
                System.out.println(number);
            }
        }
    }

}
