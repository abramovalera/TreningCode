package AnswerBook.StaticFinal;

public class Animal {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby");
        dog1.printAnimal();
    }
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void printAnimal(){
        System.out.println(name);
    }
}
