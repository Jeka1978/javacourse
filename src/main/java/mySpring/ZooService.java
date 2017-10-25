package mySpring;

import animals.Dog;

import java.util.List;

public interface ZooService {
    List<Dog> getDogs();

    void drinkBeer();
}
