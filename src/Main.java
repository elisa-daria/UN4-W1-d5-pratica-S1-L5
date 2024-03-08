import entities.AudioElement;
import entities.VideoElement;

public class Main {
    public static void main(String[] args) {
        AudioElement a=new AudioElement("klsfhlhglsh",10,3);
        a.play(10,"lkskfhlkhf",3);
        VideoElement d=new VideoElement("hhfshf",5,2);
        d.play(5,"hkfhklhò",2);
        a.turnUpVolume();
        System.out.println(a.getVolume());
    }
}