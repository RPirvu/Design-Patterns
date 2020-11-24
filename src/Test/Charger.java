package Test;

public class Charger implements Element{
    private String name;
    private double price;

    Charger(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void print() {
        System.out.println(this.name + '$' +this.price);
    }
}
