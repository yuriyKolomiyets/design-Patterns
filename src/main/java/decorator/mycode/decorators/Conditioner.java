package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class Conditioner extends CarDecorator {


    public Conditioner(Car car) {
        super(car);
    }

    public String getDescription() {
        return car.getDescription() + " + " + "Conder";
    }

    public int cost() {
        return car.cost() + 200;
    }
}
