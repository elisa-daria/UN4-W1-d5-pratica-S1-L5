import entities.AudioElement;
import entities.VideoElement;

public class Main {
    public static void main(String[] args) {
        AudioElement a=new AudioElement("klsfhlhglsh",10,3);
        a.play();
        VideoElement d=new VideoElement("hhfshf",5,2,4);
        d.play();
        a.turnUpVolume();
        System.out.println(a.getVolume());


    }
}