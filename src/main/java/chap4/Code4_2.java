package chap4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class Code4_2 {

    @Test
    public void sortObject() {
        final String[] strings = {"z", "x", "y", "abc", "zzz","zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};

        // Arrays.sort(Object[])
        //All elements in the array must implement the {@link Comparable}


        //public static <T> void sort(T[] a, Comparator<? super T> c) {

        Arrays.sort(strings);
        assertArrayEquals(expected, strings);
    }

}
