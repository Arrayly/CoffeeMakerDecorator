package condiment;

import coffee.Coffee;

public class Marshmallows extends CondimentDecorator {


    public Marshmallows(Coffee coffee) {
        super(coffee);
        System.out.println("Adding some marshmallows!");
    }


    public String getDescription() {
        return coffee.getDescription() + ", Marshmallows";
    }

    public double getTotalCost() {
        return coffee.getTotalCost() + 0.49;
    }


}
