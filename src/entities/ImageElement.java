package entities;

import interfaces.BrightnessSetter;

public class ImageElement extends MultimediaElement implements BrightnessSetter {
    //attributes
    private int brightness;
    private static final int MAX_BRIGHTNESS = 7;
    private static final int MIN_BRIGHTNESS = 1;

    //constructor
    public ImageElement(String title, int brightness) {
        super(title);
        this.setBrightness(brightness);
    }

    //setters and getters


    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
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

    //it has its own method show()
public void show(){
    String brightnessChar = "";
    for (int i = 0; i < brightness; i++) {
        brightnessChar += "*";
    }
    System.out.println(getTitle() +"  "+brightnessChar);
}

}
