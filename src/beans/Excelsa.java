package beans;

public class Excelsa implements CoffeeBean{


    @Override
    public String getBeanDescription() {
        return "Excelsa";
    }

    @Override
    public double getBeanCost() {
        return 0.33;
    }
}
