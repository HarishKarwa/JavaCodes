package learnings.basic;

public class StringPractice {

    public static void main(String...args) {

        String strOne = "Harish";
        String strTwo = "Karwa";

        //to get character at particular index
        System.out.println(strOne.charAt(0));

        //Comparison
        String strThree = "";
        System.out.println(strOne.compareTo(strThree));
        System.out.println(strTwo.compareTo(strOne));
        System.out.println(strOne.compareTo(strOne));

        //Concatenation
        strThree = strOne + " " + strTwo;
        System.out.println(strThree);

        //Ending with check
        System.out.println(strThree.endsWith("wa"));

        //Equals - Comparison - ==
        String steEqualsOne = "Harish";
        String steEqualsTwo = new String("Harish");
        System.out.println(steEqualsOne.equals(steEqualsTwo));
        System.out.println(steEqualsOne == steEqualsTwo);

        //Formatting
        //32 space, 12 after floating pt digits
        System.out.println(String.format("value : %32.12f", 2.12));
        //Hexadecimal
        System.out.println(String.format("Value : %x", 101));
        System.out.println(String.format("|%10d|", 101)); //10 character
        System.out.println(String.format("|%-10d|", 101));//10 character with spaces on left
        System.out.println(String.format("|%010d|", 101));//Spaces filled with 0

        //Getting index of
        System.out.println(strOne.indexOf("a"));
        System.out.println(strOne.indexOf("H"));
        System.out.println(strOne.lastIndexOf('h', 3));

        //empty check
        String empty = "";
        String emptyOne = null;
        System.out.println(empty.isEmpty());
        //System.out.println(emptyOne.isEmpty()); - exception

        char[] arr = strOne.toCharArray();
        for(char c : arr) {
            System.out.println(c);
        }
    }

}
