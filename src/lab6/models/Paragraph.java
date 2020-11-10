public class Paragraph implements Element {
    private String name;
    private AlignStrategy TextAlignment;
    
    Paragraph(String name)  {
        this.name=name;
    }

    public void print() {
        if(TextAlignment!=null) {
            TextAlignment.render(this);
        }
        else {
        System.out.println("Pargraph with name: " + this.name);
        }
    }

    public void setAlignStrategy(AlignStrategy alignment) {
        this.TextAlignment = alignment;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
