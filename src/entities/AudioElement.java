package entities;

import interfaces.AudioVideoPlayer;

public class AudioElement extends MultimediaElement implements AudioVideoPlayer {

    //attributes
    private int duration;
    private int volume;



    public AudioElement(String title,int duration,int volume) {
        super(title);
        this.setDuration(duration);
        this.setVolume(volume);

    }
//getters and setters
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

    @Override
    public void play(int duration,String title,int volume) {
        String volumeChar = "";
        for (int i = 0; i < volume; i++) {
            volumeChar += "!";
        }

        for (int i = 0; i <= duration; i++) {
            System.out.println(i + " " + title + volumeChar);
        }
    }





}
