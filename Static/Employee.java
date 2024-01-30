package Static;

public class Employee {
    private static String companyName;

    public  String getCompanyName() {
        return companyName;
    }

    public  void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }
    public static void show()
    {
        System.out.println("This is an static method");
    }
}
