package entities;

import interfaces.AudioVideoPlayer;

public class AudioElement extends MultimediaElement implements AudioVideoPlayer {
    public AudioElement(String title) {
        super(title);
    }




    @Override
    public void turnUpVolume() {

    }

    @Override
    public void turnDownVolume() {

    }

    public void play() {

    }
}
