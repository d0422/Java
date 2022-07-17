import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String input;
        String[] number;
        String[] tmp;
        List<String> operator = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("식 입력 : ");
        input = sc.next();
        System.out.println(input);
        number = input.split("\\+|-");
        for (int x = 0; x < input.length(); x++) {
            if (input.charAt(x) == '+' || input.charAt(x) == '-') {
                operator.add(String.valueOf(input.charAt(x)));
            }
        }
        tmp = operator.toArray(new String[operator.size()]);
        operator.toArray(tmp);
        Calculator c = new Calculator(number, tmp);
        System.out.println(c.cal());
    }
}
