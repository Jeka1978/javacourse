package java8;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class ListUtilTest {
    @Test
    public void countDuplicates() throws Exception {
        List<String> list = Arrays.asList("java", "JAVA", "JaVa", "groovy");

list.forEach(System.out::println);

        int count = ListUtil.countDuplicates(list, "java", String::equalsIgnoreCase);

        Assert.assertEquals(3, count);


    }


}