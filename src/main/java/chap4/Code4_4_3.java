package chap4;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wyjung on 2017. 3. 13..
 */
public class Code4_4_3 {

    @Test
    public void sortObject () {

        final List<ComparableClass> objects = new ArrayList();
        for (int i = 0; i < 10; i++) {
            objects.add(new ComparableClass(i));
        }

        //Collections.sort(objects);
        /*for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i).getValue());
        }*/

        ComparableClass[] temp = (ComparableClass[]) objects.toArray(); // <-- ClassCastException
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i].getValue());
        }


    }
}
