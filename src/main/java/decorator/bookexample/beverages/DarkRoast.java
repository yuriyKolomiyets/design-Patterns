package decorator.bookexample.beverages;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Darkroast";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
