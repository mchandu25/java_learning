package ExceptionHandling;
import java.util.*;
public class Exceptionhandling {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i=14;
        int j=sc.nextInt();
        int ans=0;
        try{
            ans=i/j;
        }catch (Exception e)
        {
            System.out.println("Something went wrong...");
        }
        System.out.println(ans);
        System.out.println("Done...");

    }
}
