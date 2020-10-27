package lab4;

import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element {

    Image realImage;
    private String url;

    ImageProxy(String name) {
        this.url = name;
    }

    ImageProxy() {
    }

//    Image loadImage() {
//        if(realImage == null){
//            realImage = new Image(url);
//        }
//        return realImage;
//    };

    public void print(){
        if(realImage == null){
            realImage = new Image(url);
        }
        realImage.print();
    }
}
