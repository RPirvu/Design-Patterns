package lab2;


public class Paragraph implements  Element{

    private String name;

    Paragraph (String name){
        this.name=name;
    }
    public void print()
    {
        System.out.print("    Paragraph: " + this.name);
        System.out.println();
    }

}