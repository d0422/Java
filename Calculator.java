package Java;

class RealCalculator {
    int left;
    int right;

    RealCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    };

    public int plus() {
        return left + right;
    }

    public int minus() {
        return left - right;
    }
}

public class Calculator {
    public static void main(String[] args) {
        int left = 1;
        int right = 2;
        RealCalculator cal = new RealCalculator(left, right);
        System.out.println(cal.plus());
        System.out.println(cal.minus());

    }

}
