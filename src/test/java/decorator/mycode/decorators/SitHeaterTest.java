package decorator.mycode.decorators;

import decorator.mycode.types.Car;
import decorator.mycode.types.Eurobliahi;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SitHeaterTest {

    Car car;

    @Before
    public void before() {
        car = new Eurobliahi();
    }

    @After
    public void after(){
        car = null;
    }

    @Test
    public void testGetDescription() {
        car = new SitHeater(car);
        Assert.assertEquals(car.getDescription(), "Ya-litovec + Sit-Heater");
        Assert.assertTrue(car.getDescription().equals("Ya-litovec + Sit-Heater"));
    }

    @Test
    public void testCost() {
        car = new SitHeater(car);
        Assert.assertEquals(car.cost(), 1280);
    }
}
