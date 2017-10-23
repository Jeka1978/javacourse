package multiple_inheritance;

public interface Mother {

    default void talkToBaby() {
        System.out.println("COME TO ME!!!!");
    }

    default void drinkWhisky() {
        System.out.println("Ihsss");
    }
}
