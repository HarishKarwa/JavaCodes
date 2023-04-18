package basic;

public class FibonacciSeries {

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int n = 10;
        int c;

        System.out.println(a);
        System.out.println(b);

        for(int i = 1; i <= n-2; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }


    }
}
