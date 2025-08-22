package HW_OOP.Museum;

public class Museum {
    private Exhibit exhibit;

    public Museum(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        exhibit.describe();
        exhibit.presrve();
    }

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }
}
