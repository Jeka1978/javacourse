package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TaxCalculatorTest {
    @Test
    public void withMaam() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        MaamResolver maamResolver = Mockito.mock(MaamResolver.class);
        Mockito.when(maamResolver.getMaam()).thenReturn(0.2);
        taxCalculator.setMaamResolver(maamResolver);
        double withMaam = taxCalculator.withMaam(100);
        Assert.assertEquals(120,withMaam,0.0001);
    }

}