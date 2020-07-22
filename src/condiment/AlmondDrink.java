package condiment;

import coffee.Coffee;

public class AlmondDrink extends CondimentDecorator {


    public AlmondDrink(Coffee coffee) {
        super(coffee);
        System.out.println("Adding some almond drink");
    }

    public String getDescription() {
        return coffee.getDescription() + ", Almond drink";
    }

    public double getTotalCost() {
        return coffee.getTotalCost() + 0.49;
    }
}
