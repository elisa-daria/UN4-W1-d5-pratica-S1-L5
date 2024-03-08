package entities;

import interfaces.AudioVideoPlayer;
import interfaces.BrightnessSetter;

public class VideoElement extends MultimediaElement implements AudioVideoPlayer, BrightnessSetter {
    public VideoElement(String title) {
        super(title);
    }





    @Override
    public void turnUpVolume() {

    }

    @Override
    public void turnDownVolume() {

    }

    public void play(int duration,String title,int volume) {
        String volumeChar = "";
        for (int i = 0; i < volume; i++) {
            volumeChar += "!";
        }

        for (int i = 0; i <= duration; i++) {
            System.out.println(i + " " + title + volumeChar);
        }
    }




    @Override
    public void lowBrightness() {

    }

    @Override
    public void incrementBrightness() {

    }
}
