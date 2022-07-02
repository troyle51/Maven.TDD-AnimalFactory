package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        Dog dog = AnimalFactory.createDog(null, null);
        String name = "Fido";
        Date birthDate = new Date();

        dog.setName(name);
        dog.setBirthDate(birthDate);
        int id = 0;

        String dogNameCheck = dog.getName();
        Date dateCheck = dog.getBirthDate();
        int idCheck = dog.getId();

        Assert.assertEquals(dogNameCheck, name);
        Assert.assertEquals(dateCheck, birthDate);
        Assert.assertEquals(idCheck, id);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        Cat cat = AnimalFactory.createCat(null, null);
        String name = "Fido";
        Date birthDate = new Date();

        cat.setName(name);
        cat.setBirthDate(birthDate);
        int id = 0;

        String catNameCheck = cat.getName();
        Date dateCheck = cat.getBirthDate();
        int idCheck = cat.getId();

        Assert.assertEquals(catNameCheck, name);
        Assert.assertEquals(dateCheck, birthDate);
        Assert.assertEquals(idCheck, id);

    }
}
