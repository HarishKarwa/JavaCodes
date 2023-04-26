package learnings.basic;

public class Overloading {

    public static void main(String args[]) {
        method("Harish");
        method("Harish", "Karwa");
    }

    static void method(String str) {
        System.out.println("Method one invoked");
    }

    static void method(String...strVargs) {
        System.out.println("Method two invoked");
    }
}
