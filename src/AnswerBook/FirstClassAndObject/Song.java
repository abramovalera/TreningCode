package AnswerBook.FirstClassAndObject;

public class Song {
    public static void main(String[] args) {

        Song emenem = new Song(120, "Song1");
        emenem.play();

        Song snoopDog = new Song(160, "Song1");
        snoopDog.play();
    }


    String title;
    int duration;

    public Song(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public void play() {
        System.out.println("Сейчас играет " + title + " (" + duration + " секунд" + ") ");
    }

}
