package interfaces;

public class ABclient {
    public static void main(String[]args)
    {
        ABimpl abObj=new ABimpl();
        abObj.funcA();
        abObj.funcB();
    }
}
