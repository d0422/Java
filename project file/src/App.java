public class App {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal();
        a.setName("Cat");
        Dog v = new Dog();
        v.setName("Dog");
        Bark b = new Bark();
        b.b(v);
        b.b(a);
        System.out.println(Sum.sumNum(1, 2, 3, 4, 5));
    }
}
