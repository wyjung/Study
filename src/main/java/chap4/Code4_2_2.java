package chap4;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class Code4_2_2 {

    @Test
    public void sortObject() {

        final NotComparable[] objects = {new NotComparable(10), new NotComparable(2)};
        final NotComparable[] expected = {new NotComparable(2), new NotComparable(10)};

        Arrays.sort(objects);
        assertArrayEquals(expected, objects);
    }
}
