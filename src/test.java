public class test {



    public static void main(String[] args) {
        //1.
        BreadFactory breadFactory = new BreadFactory();
        Bread cream = breadFactory.getBread("cream");
        Bread sugar = breadFactory.getBread("sugar");
        Bread butter = breadFactory.getBread("butter");
        System.out.println(cream.output() + sugar.output() + butter.output());

        //2.
        Calculator calculator = new Calculator();
        int result2 = calculator.add(4).subtract(3).out();
        System.out.println("result2 = " + result2 + "\n");

        //3.
        Recursive recursive = new Recursive();
        int result3 = recursive.factorial(4);
        System.out.println("result3 = " + result3 + "\n");

        //4.
        double result4 = recursive.factorial2(1000000);
        System.out.println("result4 = " + result4 + "\n");

        //5.
        Pond pond = new Pond();
        pond.start(0, 0);
        pond.getPond();
    }
}
