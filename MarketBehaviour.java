import java.util.ArrayList;

public interface MarketBehaviour {
    public void acceptToMarket(Actor actor);
    public void releaseFromMarket(ArrayList<Actor> actors);
    public void update();
}
