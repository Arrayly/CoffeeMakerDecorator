package coffee;

import beans.CoffeeBean;

public class FlatWhite extends Coffee implements CoffeeBean {

    private final double baseCost = 1.30;
    private final CoffeeBean beans;
    private double totalCost;
    private final String description;

    public FlatWhite(CoffeeBean beans) {
        this.beans = beans;
        totalCost = beans.getBeanCost() + baseCost;
        description = "FlatWhite with " + beans.getBeanDescription();
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
            case TALL -> totalCost += 0.42;
            case GRANDE -> totalCost += 0.59;
            case VENTE -> totalCost += 0.89;
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
