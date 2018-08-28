package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class SitHeater extends CarDecorator {

    private final int SITHEATERCOST = 780;

    public SitHeater(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " + " + "Sit-Heater";
    }

    public int cost() {
        return car.cost() + SITHEATERCOST;
    }
}
