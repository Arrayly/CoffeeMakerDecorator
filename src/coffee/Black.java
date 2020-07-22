package coffee;

import beans.CoffeeBean;

public class Black extends Coffee implements CoffeeBean {

    private final double baseCost = 0.91;
    private final CoffeeBean beans;
    private double totalCost;
    private final String description;

    public Black(CoffeeBean beans) {
        this.beans = beans;
        totalCost = beans.getBeanCost() + baseCost;
        description = "Black with " + beans.getBeanDescription();
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
            case TALL -> totalCost += 0.22;
            case GRANDE -> totalCost += 0.29;
            case VENTE -> totalCost += 0.69;
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
