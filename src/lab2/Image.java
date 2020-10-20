package lab2;

public class Image implements Element {
    private String name;

    Image (String name){
        this.name=name;
    }
    public void print()
    {
        System.out.print("    Image: " + this.name);
        System.out.println();
    }
}