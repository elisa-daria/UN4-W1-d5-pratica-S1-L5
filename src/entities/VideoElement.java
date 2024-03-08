package entities;

import interfaces.AudioVideoPlayer;
import interfaces.BrightnessSetter;

public class VideoElement extends MultimediaElement implements AudioVideoPlayer, BrightnessSetter {
    //attributes
    private int duration;
    private int volume;
    public VideoElement(String title,int duration, int volume) {
        super(title);
        this.setDuration(duration);
        this.setVolume(volume);

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
