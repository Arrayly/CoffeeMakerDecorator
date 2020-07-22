package beans;

public class Robusta implements CoffeeBean {


    @Override
    public String getBeanDescription() {
        return "Robusta";
    }

    @Override
    public double getBeanCost() {
        return 0.24;
    }
}
