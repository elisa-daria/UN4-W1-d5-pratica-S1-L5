package entities;

import interfaces.BrightnessSetter;

public class ImageElement extends MultimediaElement implements BrightnessSetter {
    public ImageElement(String title) {
        super(title);
    }


    @Override
    public void lowBrightness() {

    }

    @Override
    public void incrementBrightness() {

    }

    //it has its own method show()

}
