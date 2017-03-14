package chap4;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class ComparableClass implements Comparable<ComparableClass> {

    private int value;

    ComparableClass (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int compareTo(ComparableClass o) {
        return o.getValue() - this.value;
    }
}
