package interfaces;

public class ABimpl implements A,B{

    @Override
    public void funcA() {
        System.out.println("This is my function one");
    }

    @Override
    public void funcB() {
        System.out.println("This is my function two");
    }
}
