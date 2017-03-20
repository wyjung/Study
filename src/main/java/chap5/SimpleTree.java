package chap5;

/**
 * Created by wyjung on 2017-03-20.
 */
public class SimpleTree<E extends Comparable>  {
    private E value;
    private SimpleTree<E> left;
    private SimpleTree<E> right;

    public SimpleTree (E value, SimpleTree left, SimpleTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public boolean search (final E toFind) {
        if (toFind.equals(value)) {
            return true;
        }

        if (toFind.compareTo(value) < 0 && left != null) {
            return left.search(toFind);
        }

        return right != null && right.search(toFind);
    }

    public void insert (final E toInsert) {
        if (toInsert.compareTo(value) < 0) {
            if (left == null) {
                left = new SimpleTree<E>(toInsert, null, null);
            } else {
                left.insert(toInsert);
            }
        } else {
            if (right == null) {
                right = new SimpleTree<E>(toInsert, null, null);
            } else {
                right.insert(toInsert);
            }
        }
    }



}
