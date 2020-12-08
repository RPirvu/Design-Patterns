package main.Test;
import java.util.ArrayList;

public class Box implements Element{
    private String name;
    private ArrayList<Element> content = new ArrayList<>();


    public Box(String name){
        this.name=name;
    }

    public void addItem(Element elem){
        content.add(elem);
    }

    public void accept(Visitor v){

        v.visit(this);
        for(Element i:content){
            i.accept(v);
        }

    }

    public void print() {
        if(this.content.size() == 0){
            System.out.println(this.name + " is Empty!");
        }
        else {
            System.out.println(this.name + ":");
        }
        for(Element i:content){
            i.print();
        }
    }
}
