package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationMarksCount {
    public static void main(String args[]) {
        String string = "Harish is a good guy, he'll work hard to complete the task.";
        String[] strings = string.split(" ");
        String pattern = "[a-zA-Z0-9]*";
        int count = 0;
        for(String i : strings) {
            if(!Pattern.matches(pattern, i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
