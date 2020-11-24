package Test;

public class Phone implements Element{
    private String name;
    private double price;
    private OperatingSystem os;
    private String mesaj;



    Phone(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void setOS(OperatingSystem os){
        this.os=os;
    }

    public void print() {
        if(os == null) {
            System.out.println(this.name + " $" + this.price);
        }else{
            os.render(this);
        }
    }
}
