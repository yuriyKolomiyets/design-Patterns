package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class SitHeater extends CarDecorator {


    public SitHeater(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " + " + "Sit-Heater";
    }

    public int cost() {
        return car.cost() + 780;
    }
}
