public class Recursive {

    public int factorial(int n) {

        if (n < 2) {
            return n;
        }

        return factorial(n - 1) * n;
    }

    public double factorial2(int n) {
        double num = 1d;

        for (int i = 1; i <= n; i++) {
            num *= i;
        }

        return num;
    }
}
