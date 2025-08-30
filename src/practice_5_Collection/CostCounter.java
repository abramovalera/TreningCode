package practice_5_Collection;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    // массив, индекс = номер месяца
    private ArrayList<Double> costPerMounth;
    // метод получения значения расхода  по месяцу


    public CostCounter() {
        this.costPerMounth = new ArrayList<>();
    }


    //метод добавления значения по индексу по номеру месяца (от 1 до 12) и расхода в этом месяце
    public void addCosts(int mount, Double cost) {
        costPerMounth.add(mount - 1, cost);
    }

    // метод получения значения расхода по месяцу
    public Double getCosts(int month) {
        return costPerMounth.get(month - 1);
    }
    public Double minCosPerMonth(){
        AtomicReference<Double> min = new AtomicReference<>(costPerMounth.getFirst());
        costPerMounth.forEach(
                costPerMounth -> {
                    if (costPerMounth < min.get()){
                        min.set(costPerMounth);
                    }

                }
        );
        return min.get();
    }
}
