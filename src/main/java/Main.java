
public class Main {

    public static void main(String[] args) {
      showInfo();
    }

    static void showInfo() {
        Cat cat = new Cat();
        cat.run(200);
        cat.swim(150);

        Dog dog = new Dog();
        dog.run(26);
        dog.swim(60);

        Cat murzik = new Cat(10, 15);
        murzik.runWithDistance(11);

        Dog muhtar = new Dog(600, 10);
        muhtar.runWithDistance(500);
        muhtar.swimWithDistanse(10);

        System.out.println("Вы создали " + Cat.catCount + " котов");
        System.out.println("Вы создали " + Dog.dogCount + " собак");
    }
}