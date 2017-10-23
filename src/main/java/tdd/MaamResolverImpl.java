package tdd;

import lombok.Singular;
import lombok.SneakyThrows;

public class MaamResolverImpl implements MaamResolver {
    @Override
    @SneakyThrows
    public double getMaam() {
        Thread.sleep(2000);
        return 0.17;
    }
}
