package chap4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.fail;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class Code4_3 {

    @Test
    public void sortNotComparable() {
        final List<NotComparable> objects = new ArrayList();

        for (int i = 0; i < 10; i++) {
            objects.add(new NotComparable(i));
        }

        try {
          Arrays.sort(objects.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }

        fail();
    }

}
