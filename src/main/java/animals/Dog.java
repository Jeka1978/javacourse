package animals;

public class Dog implements Animal {


    public void bringSomething(Object obj) {
        System.out.println("take your: "+obj);
    }

    @Override
    public void makeVoice() {
        System.out.println("au au");
    }
}
