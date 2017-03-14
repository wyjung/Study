package chap4;

import java.util.Comparator;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class ComparatorClass implements Comparator<ComparatorClass> {

    private int value;

    ComparatorClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int compare(ComparatorClass o1, ComparatorClass o2) {
        return o1.getValue() - o2.getValue();
    }
}
