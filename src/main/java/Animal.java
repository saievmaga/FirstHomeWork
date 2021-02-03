public abstract class Animal {

    public int maxRunDistance;
    public int maxSwimDistance;

    abstract public void swim(int distance);
    abstract public void run(int distance);

    abstract public void swimWithDistanse(int distance);
    abstract public void runWithDistance(int distance);
}