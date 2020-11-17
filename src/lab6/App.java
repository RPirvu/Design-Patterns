package lab6;
import lab6.models.*;
import lab6.services.*;



public class App {
    public static void main(String[] args) throws Exception {

        Section cap1 = new Section("Capitolul 1");
        Section cap2 = new Section("Capitolul 2");
        cap1.add(cap2);
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("resources/heart.png"));
        cap1.add(new Image("resources/nature.jpg")); 
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));
        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();



    }
}
