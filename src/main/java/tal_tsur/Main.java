package tal_tsur;

import org.springframework.beans.BeanUtils;

public class Main {
    public static void main(String[] args) {
        NicePerson nicePerson = new NicePerson("Tal Tsur", 44);
        AmazonPerson amazonPerson = new AmazonPerson();
        BeanUtils.copyProperties(nicePerson, amazonPerson);
        System.out.println("amazonPerson = " + amazonPerson);
    }
}
