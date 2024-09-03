import java.util.Arrays;

public class ArrayEquality {

    public static boolean areArraysEqual(int[] a1, int[] a2) {
        if (a1 == null || a2 == null) {
            return a1 == a2;
        }
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areMultidimensionalArraysEqual(int[][] a1, int[][] a2) {
        if (a1 == null || a2 == null) {
            return a1 == a2;
        }
        if (a1.length != a2.length) {
            return false;
        }

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (a1[i][j] != a2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }




    public int[] getSingleDimensionArray() {
        return new int[]{2, 3, 5, 7};
    }

    public int[][] getMultiDimensionArray() {
        return new int[][]{{2, 3}, {5, 7}, {11, 13}};
    }

    public static void main(String[] args) {
        int[][] matrix = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] matrix1 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        System.out.println(areMultidimensionalArraysEqual(matrix, matrix1));
    }
}