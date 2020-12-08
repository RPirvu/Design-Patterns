package main.Test;

public class IOS implements OperatingSystem{

    public void render(Phone phone) {
        System.out.println("@IOS" + phone.getName() + " $" +phone.getPrice());
    }
}
