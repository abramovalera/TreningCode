package Practice.practice_2;

public class Student {
    //поля
    int age = 12 ;
    String name = "Петя";


// конструктор
    Student(int someAge, String someName){
        this.age = someAge;
        this.name = someName;
    }

    //гетер для поля age
    int getAge(){
        return this.age;
    }
    //гетер для поля name
    String getName(){
        return  this.name;
    }

    //сеттер для поля age
    void seaAge(int newAge){
        this.age = newAge;
    }
    //сеттер для поля name
    void setName(String newName){
        this.name =newName;
    }

    void print () {
        System.out.println("Возраст " + this.age + "Имя " + this.name);
    }



}
