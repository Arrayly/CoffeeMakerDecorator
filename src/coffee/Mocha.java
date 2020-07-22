package coffee;

import beans.CoffeeBean;

public class Mocha extends Coffee implements CoffeeBean {

    private final double baseCost = 0.81;
    private final CoffeeBean beans;
    private double totalCost;
    private final String description;

    public Mocha(CoffeeBean beans) {
        this.beans = beans;
        totalCost = beans.getBeanCost() + baseCost;
        description = "Mocha with " + beans.getBeanDescription();
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
            case TALL -> totalCost += 0.32;
            case GRANDE -> totalCost += 0.59;
            case VENTE -> totalCost += 0.79;
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
