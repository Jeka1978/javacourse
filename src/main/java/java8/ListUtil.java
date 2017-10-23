package java8;

import java.util.List;

public class ListUtil {

    public static <T> int countDuplicates(List<T> list, T t, Equaltor<T> equaltor) {
        int counter=0;
        for (T t1 : list) {
            if (equaltor.equals(t1, t)) {
                counter++;
            }
        }
        return counter;
    }
}
