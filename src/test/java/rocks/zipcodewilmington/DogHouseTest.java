package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(dog);
        System.out.println(dog.getName());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        String name = "Fido";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(dog);

        DogHouse.remove(0);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest(){
        String name = "Fido";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(dog);

        DogHouse.remove(dog);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById(){
        String name = "Milo";
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(dog);

        DogHouse.getDogById(0);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
