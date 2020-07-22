package coffee;

import beans.CoffeeBean;

public class Americano extends Coffee implements CoffeeBean {

    private final double baseCost = 1.20;
    private final CoffeeBean beans;
    private double totalCost;
    private final String description;


    public Americano(CoffeeBean beans) {
        this.beans = beans;
        totalCost = beans.getBeanCost() + baseCost;
        description = "Americano with " + beans.getBeanDescription();
    }

    @Override
    public double getTotalCost() {
        switch (getSize()) {
            case TALL -> totalCost += 0.22;
            case GRANDE -> totalCost += 0.49;
            case VENTE -> totalCost += 0.79;
        }

        return totalCost;
    }

    @Override
    public String getDescription() {
        return description;
    }


    @Override
    public String getBeanDescription() {
        return beans.getBeanDescription();
    }

    @Override
    public double getBeanCost() {
        return beans.getBeanCost();
    }


    public double getBaseCost() {
        return baseCost;
    }
}
