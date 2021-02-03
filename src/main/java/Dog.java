public class Dog extends Animal {

    public static int dogCount = 0;

    public Dog() {
        dogCount++;
    }

    public Dog(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        dogCount++;
    }



    public void run(int distance) {
        System.out.println("Борзик пробежал " + distance + "м. ");
    }

    public void swim(int distance) {
        System.out.println("Борзик проплыл " + distance + "м. ");
    }

    @Override
    public void swimWithDistanse(int distance) {
        if (this.maxSwimDistance < distance){
            System.out.println("Мухтар не смог проплыть дистанцию длинной " + distance + "м. Потому что он может проплыть " + maxSwimDistance + "м. ");
        }else {
            System.out.println("Мухтар проплыл " + distance + "м. ");
        }
    }

    @Override
    public void runWithDistance(int distance) {
        if (this.maxRunDistance < distance){
            System.out.println("Мухтар не смог пробежать дистанцию длинной " + distance + "м. Потому что он может пробежать " + maxRunDistance + "м. ");
        }else {
            System.out.println("Мухтар пробежал " + distance + "м. ");
        }
    }
}