package mySpring;

import lombok.Data;

import java.util.Random;

@Data
public class Elf {

    @InjectRandomInt(min = 7, max = 17)
    private int power;

    @InjectRandomInt(min = 3, max = 12)
    private int hp;

}
