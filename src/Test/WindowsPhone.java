package Test;

public class WindowsPhone implements OperatingSystem{

    public void render(Phone phone) {
       System.out.println("@WP" + phone.getName() + " $" +phone.getPrice());
   }

}
