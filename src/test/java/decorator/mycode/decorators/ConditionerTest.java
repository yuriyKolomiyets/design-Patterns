package decorator.mycode.decorators;

import decorator.mycode.types.Audi;
import decorator.mycode.types.Car;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConditionerTest {

    Car car;

    @Before
    public void before() {

        car = new Audi();

    }

    @After
    public void after(){
        car = null;
    }

    @Test
    public void testGetDescription() {
        car = new Conditioner(car);
        Assert.assertEquals(car.getDescription(), "Audi + Conder");
        Assert.assertTrue(car.getDescription().equals("Audi + Conder"));
    }

    @Test
    public void testCost() {
        car = new Conditioner(car);
        Assert.assertEquals(car.cost(), 20200);
    }
}
