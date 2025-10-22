package AnswerBook.StaticFinal;

public class Session {
    public static void main(String[] args) {
        Session s1 = new Session();
        s1.checkSession();
        s1.close();
    }

    static int countSession = 0;

    public Session() {
        countSession++;
    }
    public void close(){
       countSession--;
    }

    public void checkSession() {
        System.out.println(countSession);
    }
}
