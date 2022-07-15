package Java;

class Usermaker {
    String name;
    int age;

    Usermaker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

public class User {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };
        for (int num[] : arr) {
            for (int x : num) {
                System.out.println(x);
            }
        }
        Usermaker user1 = new Usermaker("이동길", 23);
        Usermaker user2 = new Usermaker("홍길동", 20);
        user1.print();
        user2.print();
    }

}
