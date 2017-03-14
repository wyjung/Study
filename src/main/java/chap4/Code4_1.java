package chap4;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class Code4_1 {

    @Test
    public void sortInts() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}
