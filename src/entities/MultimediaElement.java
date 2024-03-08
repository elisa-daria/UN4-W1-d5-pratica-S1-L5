package entities;

abstract class MultimediaElement {
   //attributes
    private  String title;

    //constructor
    public MultimediaElement(String title) {
        this.setTitle(title);
    }

    //getter

    public String getTitle() {
        return title;
    }

    //setter


    public void setTitle(String title) {
        this.title = title;
    }
}
