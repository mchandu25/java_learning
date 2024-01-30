package interfaces;
import java.util.*;
public class calculatorClient {
    public static void main(String[]args)
    {
        calculator obj=new calculatorimpl();
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        char func=sc.next().charAt(0);
        int b=sc.nextInt();
        if(func == '+')
        {
            System.out.println(obj.add(a,b));
        }
        else if(func == '-')
        {
            System.out.println(obj.sub(a,b));
        }
        else if(func == '*')
        {
            System.out.println(obj.mul(a,b));
        }
        else if(func == '/')
        {
            System.out.println(obj.div(a,b));
        }
    }
}
