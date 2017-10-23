package my_test_framework;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> type = Class.forName("my_test_framework.MyTest");
        TestRunner.runAllTests(type);

//        MyTest myTest = new MyTest();
    }
}
