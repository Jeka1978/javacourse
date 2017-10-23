package my_test_framework;


import com.nice.Person;
import mySpring.ObjectFactory;

public class MyTest {


    public MyTest() {
        System.out.println("test obj was created");
    }


    @MyBeforeClass
    public static void beforeAllTests(){
        System.out.println("This method should be invoked once!!!");
    }

    @MyBefore
    public void setUp() {
        System.out.println("initializing test state");
    }
    @MyAfter
    public void closeAll() {
        System.out.println("closing...");
    }

    public void stam(){
        System.out.println("stam");
    }




    public void test1(){
        System.out.println("111111");
    }


    public void test2(){
        System.out.println("222222");
    }
}
