package AnswerBook.StaticFinal;

public class Vk {
    public static void main(String[] args) {
        System.out.println(SettingApp.getProduction());
        SettingApp.setProduction("game2");
        System.out.println(SettingApp.getProduction());
    }
}
