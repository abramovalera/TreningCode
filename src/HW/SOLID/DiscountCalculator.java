package HW.SOLID;

/**
 * Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.
 * тернарный оператор:
 * условие ? значение_если_true : значение_если_false
 * пример: int discount = isLoyalCustomer ? 10 : 5;
 */
public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        double discount = isLoyalCustomer ? (isFirstPurchase ? 0.10 : 0.05) : (hasCoupon ? 0.07 : 0.02);
        double discountFinal = price * discount;
        return price - discountFinal;
    }

    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        System.out.println(discountCalculator.calculateDiscount(100, true, true, true ));
        System.out.println(discountCalculator.calculateDiscount(100, true, false, true ));
        System.out.println(discountCalculator.calculateDiscount(100, false, true, true ));
        System.out.println(discountCalculator.calculateDiscount(100, false, false, false ));

    }
}