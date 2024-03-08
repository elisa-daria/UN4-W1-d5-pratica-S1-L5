package entities;

import interfaces.AudioVideoPlayer;
import interfaces.BrightnessSetter;

public class VideoElement extends MultimediaElement implements AudioVideoPlayer, BrightnessSetter {
    //attributes
    private int duration;
    private int volume;

    private int brightness;

    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 5;
    private static final int MAX_BRIGHTNESS = 7;
    private static final int MIN_BRIGHTNESS = 1;

    // constructor
    public VideoElement(String title,int duration, int volume,int brightness) {
        super(title);
        this.setDuration(duration);
        this.setVolume(volume);
        this.setBrightness(brightness);

    }
    //setters and getters


    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
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

    //methods VOLUME
    @Override
    public void turnUpVolume() {
        if(volume<MAX_VOLUME){
        volume++;
}
    }


    @Override
    public void turnDownVolume() {
        if(volume>MIN_VOLUME){
            volume--;
        }

    }

    //methods BRIGHTNESS
    @Override
    public void lowBrightness() {
        if(brightness>MIN_BRIGHTNESS){
            brightness--;
        }
    }

    @Override
    public void incrementBrightness() {
        if(brightness<MAX_BRIGHTNESS){
            brightness--;
        }
    }

    public void play() {
        String volumeChar = "";
        for (int i = 0; i < volume; i++) {
            volumeChar += "!";
        }
        String brightnessChar = "";
        for (int i = 0; i < brightness; i++) {
            brightnessChar += "*";
        }

        for (int i = 0; i <= duration; i++) {
            System.out.println(i + " " + getTitle() +" "+ volumeChar+" "+brightnessChar);
        }
    }




}
