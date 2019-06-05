package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDog() {
        Date date = new Date();
        Dog bleh = AnimalFactory.createDog("bleh", date);

        // test
        Assert.assertEquals(bleh.getBirthDate(), date);
        Assert.assertEquals(bleh.getName(), "bleh");
    }

    @Test
    public void createCat() {
        Date date = new Date();
        Cat bleh = AnimalFactory.createCat("bleh", date);

        // test
        Assert.assertEquals(bleh.getBirthDate(), date);
        Assert.assertEquals(bleh.getName(), "bleh");
    }

}
