package condiment;

import coffee.Coffee;

public abstract class CondimentDecorator extends Coffee {
    protected Coffee coffee;

    public CondimentDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription();
    }

    public double getTotalCost(){
        return coffee.getTotalCost();
    }
}
