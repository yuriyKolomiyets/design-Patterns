package decorator.mycode.types;

import decorator.mycode.car;

public class Audi extends car {

    public Audi() {
        this.description = "Audi";
    }

    public double cost() {
        return 20000;
    }
}
