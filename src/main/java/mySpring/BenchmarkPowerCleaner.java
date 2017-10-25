package mySpring;

public class BenchmarkPowerCleaner implements Cleaner {

    @InjectByFieldType
    private PowerCleaner powerCleaner;

    @Override
    public void clean() {
        long start = System.nanoTime();
        powerCleaner.clean();
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
