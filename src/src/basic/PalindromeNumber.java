package basic;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 48984;
        int temp = number;
        int sum = 0;
        int count = 0;

        while(temp >= 1) {
            int rem = temp % 10;
            sum = sum*10 + rem;
            temp /= 10;
            count++;
        }
        System.out.println(sum);

        if(sum == number)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
