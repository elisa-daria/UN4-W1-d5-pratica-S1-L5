import entities.AudioElement;
import entities.ImageElement;
import entities.VideoElement;

public class Main {
    public static void main(String[] args) {
        AudioElement a=new AudioElement("song",10,3);
        a.play();
        VideoElement d=new VideoElement("film",5,2,4);
        d.play();
        a.turnUpVolume();
        System.out.println(a.getVolume());
        ImageElement pic=new ImageElement("picture",3);
        pic.show();

    }
}