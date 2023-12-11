import java.util.ArrayList;

public class Market implements QueueBehavior, MarketBehaviour{
    ArrayList<Actor> queue = new ArrayList<>();

   @Override
   public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        takeinQueue(actor);
   }
    @Override
    public void releaseFromMarket(ArrayList<Actor> actors) {
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println(actor.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        makeOrders();
        takeOrders();
        releaseFromQueue();
    }
    @Override
    public void takeinQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }
    @Override
    public void makeOrders() {
        for (Actor actor : queue) {
            if(!actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }
    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }
    @Override
    public void releaseFromQueue() {
        ArrayList<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if(actor.isTakeOrder){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из магазина");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
