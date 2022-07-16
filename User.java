package Java;

import java.util.Scanner;

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
    public static void number(int arr[][]) {
        for (int num[] : arr) {
            for (int x : num) {
                System.out.println(x);
            }
        }
    }

    public static String makestring(int arr[][]) {
        String output = "";
        for (int num[] : arr) {
            for (int x : num) {
                output = output + x;
            }
        }
        return output;
    }

    public void print(int x) {
        System.out.println(x);
    }

    public void print(String x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User v = new User();
        int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 6 } };
        int[][] arr2 = { { 7, 8, 9 }, { 10, 11, 12 } };
        number(arr);
        number(arr2);
        String string1 = makestring(arr);
        String string2 = makestring(arr2);
        v.print(string1);
        v.print(string2);
        String name = sc.nextLine();
        Usermaker user1 = new Usermaker("이동길", 23);
        Usermaker user2 = new Usermaker(name, 20);
        user1.print();
        user2.print();
        sc.close();
    }

}
