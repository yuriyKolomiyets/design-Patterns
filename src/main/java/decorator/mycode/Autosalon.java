package decorator.mycode;

import decorator.mycode.decorators.Conditioner;
import decorator.mycode.decorators.SitHeater;
import decorator.mycode.decorators.Stereo;
import decorator.mycode.types.Audi;
import decorator.mycode.types.Car;

public class Autosalon {

    public static void main(String[] args) {

        Car car = new Audi();

        System.out.println("Price: " + car.cost() + " of " +  car.getDescription());

        car = new SitHeater(car);

        System.out.println("Price: " + car.cost() + " of " +  car.getDescription());

        car = new Stereo(car);
        car = new Conditioner(car);

        System.out.println("Price: " + car.cost() + " of " +  car.getDescription());
    }
}
