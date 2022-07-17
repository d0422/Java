import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    String[] number;
    String[] operator;

    Calculator(String[] number, String[] operator) {
        this.number = number;
        this.operator = operator;
    }

    int cal() {
        Queue<String> op = new LinkedList<>();
        Queue<Integer> num = new LinkedList<>();
        for (int x = 0; x < number.length; x++) {
            num.add(Integer.parseInt(number[x]));
        }
        for (int x = 0; x < operator.length; x++) {
            op.add(operator[x]);
        }
        int result = num.poll();
        int nextnum;
        String curop;
        while (!num.isEmpty()) {

            nextnum = num.poll();
            curop = op.poll();
            if (curop.equals("+")) {
                Plus p = new Plus(result, nextnum);
                result = p.plusnum();
            } else {
                Minus m = new Minus(result, nextnum);
                result = m.minusnum();
            }

        }
        return result;
    }
}
