package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class SitHeater extends CarDecorator {

    private final int SIT_HEATER_COST = 780;
    private final String SIT_HEATER_DESC = "Sit-Heater";


    public SitHeater(Car car) {
        super(car);
    }

    public String getDescription() {
        return new StringBuilder(car.getDescription())
                .append(" + ")
                .append(SIT_HEATER_DESC)
                .toString();
    }

    public int cost() {
        return car.cost() + SIT_HEATER_COST;
    }
}
