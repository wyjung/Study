package chap4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class Code4_4_2 {

    @Test
    public void sortObject () {

        final List<ComparatorClass> objects = new ArrayList();
        for (int i = 0; i < 10; i++) {
            objects.add(new ComparatorClass(i));
        }

        Arrays.sort(objects.toArray());

    }
}
