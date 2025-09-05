package HW.HW_OOP.Attraction;

public class AmusementPark {
    private Attraction attraction;

    public AmusementPark(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showAttraction() {
        attraction.info();
        attraction.maintain();
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }
}
