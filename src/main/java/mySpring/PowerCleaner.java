package mySpring;

import javax.annotation.PostConstruct;

public class PowerCleaner implements Cleaner {
    @InjectRandomInt(min =3, max = 7)
    private int repeat;

    @PostConstruct
    public void init() {
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void clean() {
//        long before = System.nanoTime();
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVvvvvvvvvvvvv");
        }
    }
}
