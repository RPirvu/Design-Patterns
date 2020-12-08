package main.Test;

public class ItemPriceCalculator implements Visitor{
    double phonePrice=0, chargerPrice=0, headPhonePrice=0;
    int boxcalc=0;
    public void visit(Phone phone) {
        phonePrice += phone.getPrice();
    }
    public void visit(Headphones headphones) {
        headPhonePrice += headphones.getPrice();
    }
    public void visit(Charger charger) {
        chargerPrice += charger.getPrice();
    }

    public void visit (Box box){
        boxcalc += 1;
    }

    public void printPrices(){
        System.out.println(" Phone Total Price: $"+phonePrice);
        System.out.println(" Headphone Total Price: $"+headPhonePrice);
        System.out.println(" Charger Total Price: $"+chargerPrice);
    }

}
