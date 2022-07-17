public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void feed() {
        System.out.println("bobbobbob!!");
    }

    void print() {
        System.out.println("name :" + name);
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    void feed() {
        System.out.println("walwalwal");
    }

    void animalFeed() {
        super.feed();
    }

    void print() {
        System.out.println("name :" + name);
        System.out.println("age:" + age);
    }
}