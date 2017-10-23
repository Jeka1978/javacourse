package tdd;

import lombok.Setter;

public class TaxCalculator {

    @Setter
    private MaamResolver maamResolver = new MaamResolverImpl();

    public double withMaam(double price) {
        return price + price * maamResolver.getMaam();
    }
}
