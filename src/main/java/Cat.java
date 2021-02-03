public class Cat extends Animal {

    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public Cat(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        catCount++;
    }

    public void run(int distance) {
        System.out.println("Мурзик пробежал " + distance + "м. ");
    }

    public void swim(int distance) {
        System.out.println("Мурзик проплыл " + distance + "м. ");
    }

    @Override
    public void swimWithDistanse(int distance) {
        System.out.println("Мурзик не умеет плавать");
    }

    @Override
    public void runWithDistance(int distance) {
        if (this.maxRunDistance < distance) {
            System.out.println("Мурзик не смог пробежать дистанцию длинной " + distance + "м. Потому что он может пробежать " + this.maxRunDistance + "м.");
        } else {
            System.out.println("Мурзик пробежал " + distance + "м.");
        }
    }
}