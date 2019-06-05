package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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


    @Test
    public void setBirthdateTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);

        // new date
        Date newDate = new Date();

        //change name
        cat.setBirthDate(newDate);

        Assert.assertEquals(newDate, cat.getBirthDate());
    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);

        //expected
        String expected = "bark!";

        Assert.assertEquals(expected, cat.speak());

    }

    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);

        //expected
        Integer expected = cat.getNumberOfMealsEaten() + 1;

        //action
        cat.eat(new Food());


        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void getId() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertEquals(givenId, cat.getId());
    }

    @Test
    public void Cat_MammelTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);


        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void Cat_Animal() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog cat = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Animal);
    }

}
