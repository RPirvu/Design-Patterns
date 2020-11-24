package lab7.services;

import lab7.Author;

public class AlignCenter implements Author.AlignStrategy {
    String content = "";


    AlignCenter() {
        content = "          ";
    }

    @Override
    public void render(Paragraph paragraph) {
       System.out.println(content + paragraph.getName());

    }
}
