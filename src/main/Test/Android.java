package main.Test;

public class Android implements OperatingSystem{


    public void render(Phone phone) {
        System.out.println("@Android" + phone.getName() + " $" +phone.getPrice());
    }
}
