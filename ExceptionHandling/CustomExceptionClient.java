package ExceptionHandling;

public class CustomExceptionClient {
    public static void main(String []args)
    {
        try {
            functionA(-11);
        }
        catch (CustomException e)
        {
            System.out.println(e.getMessage());
        }
    }
    static void functionA(int number) throws CustomException{
        if(number<0)
        throw new CustomException("Number is -ve");
    }
}
