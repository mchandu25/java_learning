package ExceptionHandling;

public class CustomException extends Exception{
    public CustomException(String msg)
    {
        super(msg);//this msg will be stored in throwable detailmsg;
    }

}
