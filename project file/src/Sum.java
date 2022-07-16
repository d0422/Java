public class Sum {
    static int sumNum(int... v) {
        int sum = 0;
        for (int x = 0; x < v.length; x++) {
            sum += v[x];
        }
        return sum;
    }
}
