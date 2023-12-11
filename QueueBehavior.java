public interface QueueBehavior {
    public void takeinQueue(Actor actor);
    public void makeOrders();
    public void takeOrders();
    public void releaseFromQueue();
}
