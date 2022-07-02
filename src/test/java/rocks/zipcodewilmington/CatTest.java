package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest(){
        Cat cat = new Cat(null,null,null);
        String givenName = "Garfield";

        cat.setName(givenName);

        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        Cat cat = new Cat(null,null,null);
        String speak = "meow!";

        cat.speak();

        Assert.assertEquals(speak, cat.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Cat cat = new Cat(null,null,null);
        Date dob = new Date();

        cat.setBirthDate(dob);

        Date birthDateCheck = cat.getBirthDate();
        Assert.assertEquals(birthDateCheck, dob);
    }
    // TODO - Create tests for `void eat(Food food)`

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Cat cat = new Cat(null,null,1);

        int id = 1;

        int catIdCheck = cat.getId();
        Assert.assertEquals(catIdCheck, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        Cat cat = new Cat(null,null,null);

        boolean isTrue = cat instanceof Animal;

        boolean shouldBeTrue = true;
        Assert.assertEquals(shouldBeTrue, isTrue);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        Cat cat = new Cat(null,null,null);

        boolean isTrue = cat instanceof Mammal;

        boolean shouldBeTrue = true;
        Assert.assertEquals(shouldBeTrue, isTrue);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
