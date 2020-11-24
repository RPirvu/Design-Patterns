package Test;

public interface Visitor {

    public void visit(Phone phone);
    public void visit(Headphones headphones);
    public void visit(Charger charger);

    public void visit(Box box);
}
