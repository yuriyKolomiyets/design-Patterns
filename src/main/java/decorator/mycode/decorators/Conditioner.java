package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class Conditioner extends CarDecorator {

    private final int CONDITIONER_COST = 200;
    private final String CONDITIONER_DESC = "Conder";

    public Conditioner(Car car) {
        super(car);
    }

    public String getDescription() {
        return new StringBuilder(car.getDescription())
                .append(" + ")
                .append(CONDITIONER_DESC)
                .toString();
    }

    public int cost() {
        return car.cost() + CONDITIONER_COST;
    }
}
