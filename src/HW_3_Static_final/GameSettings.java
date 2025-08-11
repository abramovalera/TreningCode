package HW_3_Static_final;

public class GameSettings {
    static int maxPlayers = 100; //GameSettings
    final String gameName;
    int currentPlayers; //сколько игроков сейчас

    public GameSettings(int currentPlayers, String gameName){
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;
    }
    public void addPlayer(){
        currentPlayers++;
    }
    public void printGameStatus(){
        System.out.println("Название игры: " + gameName);
        System.out.println("Максимальное кол-во игроков: " + maxPlayers);
        System.out.println("Текущее кол-во игроков: " + currentPlayers);
    }
    static public void setMaxPlayers(int max){
        maxPlayers = max;
    }
    public void print_(){
        System.out.println("________________________");
    }
}
