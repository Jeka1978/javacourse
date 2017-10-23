package mySpring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectFactoryTest {
    @Test
    public void testInjectRandomIntIsWorkingCorrectly() throws Exception {
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println(elf);

        Assert.assertFalse(elf.getHp() == 0);
        Assert.assertFalse(elf.getPower() == 0);
    }

}