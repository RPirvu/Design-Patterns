package lab6.services;
public class AlignLeft implements AlignStrategy{
    String content = "";

    AlignLeft() {
        content = "     ";
    }

    @Override
    public void render(Paragraph paragraph) {
        System.out.println(content+paragraph.getName());

    }

}
