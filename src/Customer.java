import beans.Arabica;
import beans.Excelsa;
import coffee.Americano;
import coffee.Coffee;
import coffee.Espresso;
import coffee.Size;
import condiment.ChocolateSprinkles;
import condiment.Marshmallows;
import condiment.Soya;
import condiment.WholeMilk;

//https://app.creately.com/diagram/aGYyVh1ns0d/edit

public class Customer {

    public static void main(String[] args) {

        Coffee americano = new Americano(new Excelsa());
        americano.setSize(Size.VENTE);

        System.out.println(americano.getTotalCost());


    }

}
