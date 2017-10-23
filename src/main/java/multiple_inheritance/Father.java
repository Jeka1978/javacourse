package multiple_inheritance;

public interface Father {

    default void talkToBaby() {
        System.out.println("come to me");
    }

    default void drinkBeer() {
        System.out.println("I love it!");
    }
}
