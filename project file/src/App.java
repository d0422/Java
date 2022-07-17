public class App {
    public void typeOfAnimal(Animal e) {
        if (e instanceof Dog) {
            System.out.println("Animal!!");
        } else {
            System.out.println("Dog!!");
        }
    }

    public static void main(String[] args) throws Exception {

        Animal a = new Animal("cat");
        Dog v = new Dog("dog", 3);
        a.print();
        v.print();
        Bark b = new Bark();
        App app = new App();
        app.typeOfAnimal(a);
        app.typeOfAnimal(v);
        b.b(v);
        b.b(a);
        v.feed();
        v.animalFeed();
        a.feed();
        System.out.println(Sum.sumNum(1, 2, 3, 4, 5));
    }
}
