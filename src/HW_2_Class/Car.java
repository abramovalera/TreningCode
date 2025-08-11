package HW_2_Class;

public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand; //this. ссылка на текущий объект (экземпляр класса) this.brand означает: Поле brand этого объекта.
        this.year = year;
    }

    //гетеры
    String getBran() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }
    //сетеры

    //  я написал сетер - метод который изменяет значение поля brand в объекте
    // он принимает новое значение в параметре NewBrand и присваевает его полю brand
    void setBrand(String NewBrand) {
        this.brand = NewBrand;
    }

    void setYear(int NewYear) {
        this.year = NewYear;
    }

    public void printM() {
        System.out.println("Бренд тачки: " + this.brand + ", " + "Год выпуска: " + this.year);
    }


}
