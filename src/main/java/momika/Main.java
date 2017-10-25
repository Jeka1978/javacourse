package momika;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        RandomNameConfigurator configurator = new RandomNameConfigurator();
        Person person = new Person();
        configurator.configure(person);
    }
}
