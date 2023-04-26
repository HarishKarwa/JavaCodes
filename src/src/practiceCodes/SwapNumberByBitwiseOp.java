package practiceCodes;

public class SwapNumberByBitwiseOp {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);

        a = a*b; // 2
        b = a/b; // 2/1
        a = a/b; // 2/2

        System.out.println(a);
        System.out.println(b);
    }
}
