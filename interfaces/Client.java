package interfaces;

public class Client {
    public static void main(String [] args)
    {
        Parent interfaceImpl=new parentImpl();
        interfaceImpl.display();
        interfaceImpl=new parentImpl2();
        interfaceImpl.display();
    }
}
