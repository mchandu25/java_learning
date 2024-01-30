package Inheritance;

public class Client {
    public static void main(String[] args)
    {
        Parent parent=new Parent();
//        parent.display();
        Child child=new Child();
//        child.display();
//        child.newFunction();
        Parent parentRef;
        parentRef=parent;
        parentRef.display();
        parentRef=child;
        parentRef.display();
    }
}
