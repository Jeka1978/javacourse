package mySpring;


import animals.Dog;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quoters.TalkingRobot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class ZooServiceImpl  {


    public ZooServiceImpl(Integer numberOfDogs) {
        this.numberOfDogs = numberOfDogs;
    }

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
