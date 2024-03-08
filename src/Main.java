import entities.AudioElement;
import entities.ImageElement;
import entities.MultimediaElement;
import entities.VideoElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        AudioElement a=new AudioElement("song",10,3);
//        a.play();
//        VideoElement d=new VideoElement("film",5,2,4);
//        d.play();
//        a.turnUpVolume();
//        System.out.println(a.getVolume());
//        ImageElement pic=new ImageElement("picture",3);
//        pic.show();

        Scanner scanner = new Scanner(System.in);
        MultimediaElement[] media = new MultimediaElement[5];

        for (int i = 0; i < media.length; i++) {
            System.out.println("Digita n. del tipo di media (1: Audio, 2: Video, 3: Immagine): ");
            int mediaType = Integer.parseInt(scanner.nextLine());


            switch (mediaType) {
                case 1://audio
                    System.out.println("Digita il titolo della canzone " + (i + 1) + ": ");
                    String audioTitle = scanner.nextLine();
                    System.out.println("Inserisci la durata della canzone " + (i + 1) + ": ");
                    int audioDuration = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci il volume della canzone " + (i + 1) + ": ");
                    int audioVolume = Integer.parseInt(scanner.nextLine());

                    media[i] = new AudioElement(audioTitle, audioDuration, audioVolume);
                    break;
                case 2://video
                    System.out.println("Digita il titolo del film " + (i + 1) + ": ");
                    String videoTitle = scanner.nextLine();
                    System.out.println("Inserisci la durata del film " + (i + 1) + ": ");
                    int videoDuration = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci il volume del film " + (i + 1) + ": ");
                    int videoVolume = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci la luminosità del film " + (i + 1) + ": ");
                    int videoBrightness = Integer.parseInt(scanner.nextLine());

                    media[i] = new VideoElement(videoTitle,videoDuration,videoVolume,videoBrightness);
                    break;
                case 3://immagine
                    System.out.println("Digita il titolo del quadro " + (i + 1) + ": ");
                    String imageTitle = scanner.nextLine();
                    System.out.println("Inserisci la luminosità del quadro " + (i + 1) + ": ");
                    int imageBrightness = Integer.parseInt(scanner.nextLine());
                    media[i]=new ImageElement(imageTitle,imageBrightness);
                    break;
                default:
                    System.out.println("ERRORE: media inesistente");


            }
        }
        int laScelta;
        do {
            System.out.println("Scegli il tipo di media da consumare: digita un numero da 1 a 5 o 0 per terminare: ");
            laScelta = Integer.parseInt(scanner.nextLine());
            if (laScelta >= 1 && laScelta <= 5) {
                if (media[laScelta - 1] instanceof ImageElement) {
                    ((ImageElement) media[laScelta - 1]).show();
                }
                media[laScelta - 1].play();
            } else if (laScelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (laScelta != 0);
        scanner.close();
    }
}


