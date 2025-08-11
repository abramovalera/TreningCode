package HW_2_Class;
// создаю публчный класс
public class Rectangle {
    //объявляю 2 поля
    double width;
    double height;
    //создаю конструктор с 2 параметрами double width, double height)
    public Rectangle(double width, double height){
        //Присваиваю значение параметров полям объекта
        this.width = width;
        this.height = height;
    }
    double getWidth(){
        return this.width;
    }
    double getHeight(){
        return this.height;
    }

    void setWidth (double NewWidth){
        this.width = NewWidth;
    }
    double calculateArea(){
        return width * height;
    }
    void printRectangle(){
        System.out.println("Прощадь треугольника: " + calculateArea());
    }
}
