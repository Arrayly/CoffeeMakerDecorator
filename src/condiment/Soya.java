package condiment;

import coffee.Coffee;

public class Soya extends CondimentDecorator{

    public Soya(Coffee coffee) {
        super(coffee);
        System.out.println("Adding some Soya!");
    }


    public String getDescription() {
        return coffee.getDescription() + ", Soya";
    }

    public double getTotalCost() {
        return coffee.getTotalCost() + 0.39;
    }


}
