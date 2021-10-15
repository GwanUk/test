public class Calculator {

    public int num = 0;

    public Calculator add(int n) {
        this.num += n;
        return this;
    }

    public Calculator subtract(int n) {
        this.num -= n;
        return this;
    }

    public int out() {
        return this.num;
    }
}
