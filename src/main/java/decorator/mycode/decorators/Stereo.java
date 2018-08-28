package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class Stereo extends CarDecorator {

    private final int STEREOCOST = 100;

    public Stereo(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " + " + "Stereo";
    }

    public int cost() {
        return car.cost() + STEREOCOST;
    }
}
