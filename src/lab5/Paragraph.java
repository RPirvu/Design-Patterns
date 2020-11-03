package lab5;

public class Paragraph implements Element {

    private String name;
    private AlignStrategy alignStrategy;

    public String getName(){
        return this.name;
    }

    Paragraph(String name) {
        this.name = name;
    }

    public void print() {
        if(alignStrategy==null) {
            System.out.println(this);
        }else{
            alignStrategy.render(this);
        }
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
}