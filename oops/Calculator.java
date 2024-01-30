package oops;

public class Calculator {
    // method overloading
    public void display()
    {
        System.out.println("Casio Calculator");
    }
    public void display(Integer number)
    {
        System.out.println("Casio Calculator: "+number);
    }
    public void display(String name)
    {
        System.out.println("Casio Calculator: "+name);
    }
    public void display(Double number)
    {
        System.out.println("Casio Calculator: "+number);
    }

}
