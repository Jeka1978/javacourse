public class MyFactory {
    private static MyFactory ourInstance = new MyFactory();

    public static MyFactory getInstance() {
        return ourInstance;
    }

    private MyFactory() {
    }
}
