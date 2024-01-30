package interfaces;
import java.lang.Math;
public class calculatorimpl implements calculator{


    @Override
    public int add(Integer a, Integer b) {
        return a+b;
    }

    @Override
    public int sub(Integer a, Integer b) {
        return Math.abs(a-b);
    }

    @Override
    public int mul(Integer a, Integer b) {
        return a*b;
    }

    @Override
    public int div(Integer a, Integer b) {
        return a/b;
    }
}
