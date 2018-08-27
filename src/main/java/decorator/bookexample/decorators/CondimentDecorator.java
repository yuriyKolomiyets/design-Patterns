package decorator.bookexample.decorators;

import decorator.bookexample.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
