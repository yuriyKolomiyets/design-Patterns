package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class Stereo extends CarDecorator {


    public Stereo(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " + " + "Stereo";
    }

    public int cost() {
        return car.cost() + 100;
    }
}
