package condiment;

import coffee.Coffee;

public class WholeMilk extends CondimentDecorator {

    public WholeMilk(Coffee coffee) {
        super(coffee);

        System.out.println("Adding Whole milk!");
    }

    public String getDescription() {
        return coffee.getDescription() + ", Whole milk";
    }

    public double getTotalCost() {
        return coffee.getTotalCost() + 0.30;
    }
}
