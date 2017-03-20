package chap5;

import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by wyjung on 2017-03-21.
 */
public class Code5_13 {

    @Test
    public void linkedHashMapTraversal() {
        final Map<Integer,String> counts = new LinkedHashMap();
        counts.put(4, "four");
        counts.put(1, "one");
        counts.put(3, "three");
        counts.put(2, "two");

        final Iterator<Integer> keys = counts.keySet().iterator();
        assertEquals(Integer.valueOf(4), keys.next());
        assertEquals(Integer.valueOf(1), keys.next());
        assertEquals(Integer.valueOf(3), keys.next());
        assertEquals(Integer.valueOf(2), keys.next());

    }
}
