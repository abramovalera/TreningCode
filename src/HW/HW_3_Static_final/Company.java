package HW.HW_3_Static_final;

public class Company {
    static String companyName = "Вкусно и точка";
    final int employeeId;
    String employeeName;


    //конструктор
    Company (int employeeId, String employeeName){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    //статичный метод
    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }


//employeeName гетеры и сетеры
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
