
package Collect;


public enum Traffic 
{
    RED("stop"),
    GREEN("go"),
    YELLOW("ready");
    private final String out;
    
    Traffic(String name)
    {
        this.out=name;
    }
    public String get()
    {
        return out;
    }
}
