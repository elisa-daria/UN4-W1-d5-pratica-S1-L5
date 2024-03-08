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

    public void play() {

    }




    @Override
    public void lowBrightness() {

    }

    @Override
    public void incrementBrightness() {

    }
}
