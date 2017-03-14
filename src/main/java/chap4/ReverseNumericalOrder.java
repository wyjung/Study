package chap4;

import java.util.Comparator;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class ReverseNumericalOrder implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
