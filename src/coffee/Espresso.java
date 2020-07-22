package coffee;

import beans.CoffeeBean;

public class Espresso extends Coffee implements CoffeeBean {

    private final double baseCost = 1.50;
    private final CoffeeBean beans;
    private double totalCost;
    private final String description;

    public Espresso(CoffeeBean beans) {
        this.beans = beans;
        totalCost = beans.getBeanCost() + baseCost;
        description = "Espresso with " + beans.getBeanDescription();
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
            case TALL -> totalCost += 0.62;
            case GRANDE -> totalCost += 0.89;
            case VENTE -> totalCost += 0.129;
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
