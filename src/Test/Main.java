package Test;

public class Main {
    public static void main(String[] args) {
        //Main Box
        Box box1 = new Box("BOX");

        //Other Items
        Charger charger1 = new Charger("ChargerA", 5.99);
        Headphones headphones1 = new Headphones("Headphone A", 10.99);

        //Phones
        Phone phone1 = new Phone("Phone 1", 299.99);
        Phone phone2 = new Phone("Phone 2", 199.99);
        Phone phone3 = new Phone("Phone 3", 249.99);

        //Operating System
        phone1.setOS(new WindowsPhone());
        phone2.setOS(new Android());
        phone3.setOS(new IOS());

        //Sub Box
        Box miniBox = new Box("Mini Box");


        box1.addItem(charger1);
        box1.addItem(headphones1);
        box1.addItem(phone1);
        box1.addItem(phone2);
        box1.addItem(phone3);
        box1.addItem(miniBox);


        box1.print();
        ItemPriceCalculator ipc = new ItemPriceCalculator();
        box1.accept(ipc);
        System.out.println("Prince List:");
        ipc.printPrices();
        /*
        BOX:
        ChargerA$5.99
        Headphone A$10.99
        @WPPhone 1 $299.99
        @AndroidPhone 2 $199.99
        @IOSPhone 3 $249.99
        Mini Box is Empty!
        Price List:
         Phone Total Price: $749.97
         Headphone Total Price: $10.99
         Charger Total Price: $5.99

Process finished with exit code 0

        */
    }

}
