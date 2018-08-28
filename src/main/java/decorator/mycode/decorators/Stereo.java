package decorator.mycode.decorators;

import decorator.mycode.types.Car;

public class Stereo extends CarDecorator {

    private final int STEREO_COST = 100;
    private final String STEREO_DESC = "Stereo";

    public Stereo(Car car) {
        super(car);
    }

    public String getDescription() {
        return new StringBuilder(car.getDescription())
                .append(" + ")
                .append(STEREO_DESC)
                .toString();    }

    public int cost() {
        return car.cost() + STEREO_COST;
    }
}
