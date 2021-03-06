package main.lab5;

import java.util.concurrent.TimeUnit;
import java.io.IOException;


public class Image implements Element{

    private String imageName;

    Image(String name){
        this.imageName=name;
        try {
            TimeUnit.SECONDS.sleep(2);
            ImageLoaderFactory.create(name);

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public void print(){
        System.out.println("Image with name: "+this.imageName);
    }

}