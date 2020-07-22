package coffee;

import beans.CoffeeBean;

public abstract class Coffee {
    Size size = Size.SHORT;

    public abstract double getTotalCost();
    public abstract String getDescription();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
