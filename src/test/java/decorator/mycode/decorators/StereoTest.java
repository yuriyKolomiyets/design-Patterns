package decorator.mycode.decorators;

import decorator.mycode.types.Audi;
import decorator.mycode.types.Car;
import decorator.mycode.types.Mers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StereoTest {

    Car car;

    @Before
    public void before() {

        car = new Mers();
    }

    @After
    public void after(){
        car = null;
    }

    @Test
    public void testGetDescription() {
        car = new Stereo(car);
        Assert.assertEquals(car.getDescription(), "Mers + Stereo");
        Assert.assertTrue(car.getDescription().equals("Mers + Stereo"));
    }

    @Test
    public void testCost() {
        car = new Stereo(car);
        Assert.assertEquals(car.cost(), 40100);
    }
}
