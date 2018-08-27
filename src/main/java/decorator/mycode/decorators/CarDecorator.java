package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public abstract class CarDecorator extends Car {

    final protected Car car;

    protected CarDecorator(Car car) {
        this.car = car;
    }

    public abstract String getDescription();



}
