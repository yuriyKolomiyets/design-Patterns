package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class Conditioner extends CarDecorator {

    private final int CONDITIONERCOST = 200;

    public Conditioner(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " + " + "Conder";
    }

    public int cost() {
        return car.cost() + CONDITIONERCOST;
    }
}
