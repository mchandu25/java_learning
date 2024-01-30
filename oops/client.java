package oops;

public class client {
    public static void main(String[] args)
    {
        Employee employee=new Employee();
        System.out.println(employee.toString());
        Employee employee1=new Employee(1,"Chandu",1000000.00,"Ford");
        System.out.println(employee1.toString());
        Calculator calculator;
        calculator=new Calculator();
        calculator.display();
        calculator.display(110);
        calculator.display("Ford");
        calculator.display(260.00);
    }
}
