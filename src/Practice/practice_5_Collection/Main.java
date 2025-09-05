package Practice.practice_5_Collection;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounte = new CostCounter();
        costCounte.addCosts(1,123.12);
        costCounte.addCosts(2,424.65);
        costCounte.addCosts(3,345.66);
        costCounte.addCosts(4,4234235.87);
        costCounte.addCosts(5,132.24);
        costCounte.addCosts(6,223.00);

        System.out.println(costCounte.getCosts(3));
        System.out.println(costCounte.minCosPerMonth());
    }
}
