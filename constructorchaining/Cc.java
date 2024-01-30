package constructorchaining;

public class Cc {
    private String name;

    public Cc()
    {
        this("ford");
        System.out.println("This is a default constructor");
    }
    public Cc(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }

}
