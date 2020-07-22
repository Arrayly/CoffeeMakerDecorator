package coffee;

import beans.CoffeeBean;

public class Cappucino extends Coffee implements CoffeeBean {

    private final double baseCost = 1.10;
    private final CoffeeBean beans;
    private double totalCost;
    private final String description;

    public Cappucino(CoffeeBean beans) {
        this.beans = beans;
        totalCost = beans.getBeanCost() + baseCost;
        description = "Cappucino with " + beans.getBeanDescription();
    }

    @Override
    public String getBeanDescription() {
        return description;
    }

    @Override
    public double getBeanCost() {
        return beans.getBeanCost();
    }

    @Override
    public double getTotalCost() {
        switch (getSize()) {
            case TALL -> totalCost += 0.52;
            case GRANDE -> totalCost += 0.69;
            case VENTE -> totalCost += 0.99;
        }

        return totalCost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public double getBaseCost() {
        return baseCost;
    }
}
