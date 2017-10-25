package mySpring;


import animals.Dog;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ZooServiceImpl  {
    @InjectRandomInt(min = 3, max = 7)
    private int numberOfDogs;

    @Benchmark
    public void xxxxx(){
        System.out.println("ZZZZZZZZZZZZZZZZXXXXXXXXXx");
    }

    public List<Dog> getDogs(){
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < numberOfDogs; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    @Benchmark
    public void drinkBeer() {
        System.out.println("drinking beer");
    }
}
