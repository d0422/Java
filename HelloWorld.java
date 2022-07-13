package Java;

public class HelloWorld {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6 } };
        for (int num[] : arr) {
            for (int x : num) {
                System.out.println(x);
            }
        }
    }
}