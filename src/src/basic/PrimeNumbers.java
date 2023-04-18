package basic;

public class PrimeNumbers {

    public static void main(String args[]) {
        int count = 1;
        int number = 3;
        System.out.println(2);

        while(count != 10) {
            boolean flag = false;
            for(int i = 2; i <= number/2; i++) {
                if(number%i == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
}
