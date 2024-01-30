package ExceptionHandling;
import java.util.*;
public class ExceptionhandlingTypes {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=0;
        int arr[]=new int[8];
        String str=null;
        try {
            j=18/i;
            System.out.println(arr[1]);
            System.out.println(arr[7]);
            System.out.println(str.length());
        }catch (ArithmeticException e)
        {
            System.out.println("You cannot divide a number with 0");
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Acess the array within the limit");
        }
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally always get executed here");
        }
        try{
        functionA();}
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(j);
        System.out.println("Done with the execution");
    }
    static void functionA()
    {
        int j=10/0;
    }
}
