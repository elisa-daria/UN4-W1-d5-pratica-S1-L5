package interfaces;

public interface AudioVideoPlayer {

    public void turnUpVolume();
    public void turnDownVolume();
    public void play(int duration, String title, int volume);
}
