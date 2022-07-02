package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest() {
        String givenName = "Summer";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //given
        Dog dog = new Dog(null,null,null);
        String speak = "bark!";
        //when
        dog.speak();
        //then
        Assert.assertEquals(speak,dog.speak());
    }
//     TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog(null,null,null);
        Date dob = new Date();

        dog.setBirthDate(dob);

        Date birthDate = dog.getBirthDate();
        Assert.assertEquals(birthDate, dob);

    }
    // TODO - Create tests for `void eat(Food food)`
//    @Test
//    public void eatFoodTest(){
//        Dog dog = new Dog(null,null,null);
//        String kibble = "kibbles";
//
//        dog.eat();
//
//        String foodAte = dog.eat();
//        Assert.assertEquals(foodAte,kibble);
//    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Dog dog = new Dog(null,null,2);

        int id = 2;

        int dogId = dog.getId();
        Assert.assertEquals(dogId, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        Dog dog = new Dog(null,null,null);

        boolean isTrue = dog instanceof Animal;

        boolean shouldBeTrue = true;
        Assert.assertEquals(shouldBeTrue, isTrue);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        Dog dog = new Dog(null,null,null);

        boolean isTrue = dog instanceof Mammal;

        boolean shouldBeTrue = true;
        Assert.assertEquals(shouldBeTrue, isTrue);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

}
