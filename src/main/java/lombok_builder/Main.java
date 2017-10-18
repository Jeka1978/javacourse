package lombok_builder;

public class Main {
    public static void main(String[] args) {
        PubClient client = PubClient.builder().name("Tzvika")
                .age(32).beer("Guiness").beer("Stella")
                .priority("Chips", 3)
                .priority("Antrikot", 89)
                .oneFish("salamon")
                .build();
        System.out.println("client = " + client);
    }
}
