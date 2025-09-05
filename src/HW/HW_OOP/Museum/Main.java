package HW.HW_OOP.Museum;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript1 = new Manuscript();
        Museum musemBig = new Museum(manuscript1);
        musemBig.showExhibit();

        Exhibit sculture1 = new Sculpture();
        musemBig.setExhibit(sculture1);
        musemBig.showExhibit();

    }
}
