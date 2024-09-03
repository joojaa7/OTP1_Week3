import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayEqualityTest {

    private final ArrayEquality arrayEquality = new ArrayEquality();

    @Test
    public void singleDimensionsArrayEquality() {
        int[] a1 = arrayEquality.getSingleDimensionArray();
        int[] a2 = { 2, 3, 5, 7 };
        int[] a3 = { 2, 3, 5, 8 }; // Changed last element
        assertArrayEquals(a1, a2, "Should be equal.");
        assertNotEquals(a1, a3, "Should not be equal.");
    }


    @Test
    public void multiDimensionalArrayEquality() {
        int[][] expected = { { 2, 3 }, { 5, 7 }, { 11, 135 } };
        int[][] expected1 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] actual = arrayEquality.getMultiDimensionArray();
        assertArrayEquals(expected1, actual, "Should be equal");
        assertNotEquals(expected, actual, "Should not be equal.");
    }

    @Test
    public void testDifferentTypeArrayEquality() {
        // Test for String array
        String[] s1 = { "Hello", "World" };
        String[] s2 = { "Hello", "World" };
        assertArrayEquals(s1, s2, "String arrays should be equal");

        // Test for double array
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals(d1, d2, 0.0001, "Double arrays should be equal");
    }

}