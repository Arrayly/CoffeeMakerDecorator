package condiment;

import coffee.Coffee;

public class ChocolateSprinkles extends CondimentDecorator {

    public ChocolateSprinkles(Coffee coffee) {
        super(coffee);
        System.out.println("Adding chocolate sprinkles!");
    }

    public String getDescription() {
        return coffee.getDescription() + ", Chocolate Sprinkles";
    }

    public double getTotalCost() {
        return coffee.getTotalCost() + 0.15;
    }
}
