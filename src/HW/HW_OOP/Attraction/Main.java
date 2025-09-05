package HW.HW_OOP.Attraction;

public class Main {
    public static void main(String[] args) {
        Attraction reller1 = new RollerCoaster();
        AmusementPark par1 = new AmusementPark(reller1);
        par1.showAttraction();

        Attraction corusel1 = new Corusel();
        par1.setAttraction(corusel1);
        par1.showAttraction();

    }
}
