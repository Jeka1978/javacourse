package constructors;

public class Son extends Father {
    private final double pi = Math.PI;

    public Son() {
        printPi();
    }

    @Override
    public void printPi() {
        System.out.println(pi);
    }
}


