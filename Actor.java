/**
 * Actor
 */
public abstract class Actor implements ActorBehavoir{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public Actor(String name){
        this.name = name;
    }
    
}