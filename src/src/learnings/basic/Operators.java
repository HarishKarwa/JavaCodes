package learnings.basic;

public class Operators {

    public static void main(String args[]) {
        System.out.println("---------Unary---------");
        int a = 100;
        int b = 200;
        int c = 300;

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(+c);
        System.out.println(~a);

        System.out.println("-----------Shift----------");
        System.out.println(a<<2);
        System.out.println(b>>2);
        System.out.println(c>>>2);
    }
}
