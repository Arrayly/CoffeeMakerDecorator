package beans;

public class Arabica implements CoffeeBean {


    @Override
    public String getBeanDescription() {
        return "Arabica";
    }

    @Override
    public double getBeanCost() {
        return 0.50;
    }
}
