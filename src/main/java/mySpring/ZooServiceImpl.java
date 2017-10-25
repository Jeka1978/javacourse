package mySpring;


import animals.Dog;

import java.util.ArrayList;
import java.util.List;


public class ZooServiceImpl implements ZooService {
    @InjectRandomInt(min = 3, max = 7)
    private int numberOfDogs;
    @Override
    public List<Dog> getDogs(){
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < numberOfDogs; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("drinking beer");
    }
}
