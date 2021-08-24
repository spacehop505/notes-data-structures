package collection.traversal;

public class ArrayTraverse {

    public static void main(String[] args) {

        int[] array = {1, 2};
        int[][] array2D = {{1, 1}, {2, 2}, {3, 3}};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        for (int result : array) {
            System.out.print(result + ", ");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + array2D[i][j]);
            }
        }


    }

}
