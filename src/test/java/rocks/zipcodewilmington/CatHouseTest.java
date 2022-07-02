package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){
        String name = "Garfield";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(cat);
        System.out.println(cat.getName());
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        String name = "Garfield";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(cat);

        CatHouse.remove(0);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest(){
        String name = "Garfield";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(cat);

        CatHouse.remove(cat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById(){
        String name = "Garfield";
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(cat);

        CatHouse.getCatById(0);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        String name = "Kat";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        CatHouse.add(animal);

        CatHouse.getNumberOfCats();
    }
}
