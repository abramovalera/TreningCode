package HW.HW_3_Static_final;

public class University {

    static String universityName = "Университет имени Пушкина";
    final int studentId;
    String studentName;

    public University(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    static public void changeUniversityName(String newName) {
        universityName = newName;
    }

    public void printStudentInfo() {
        System.out.println("Имя уника: " + universityName + ", " + "ID: " + studentId + ", " + "Имя студентика: " + studentName);
    }
}
