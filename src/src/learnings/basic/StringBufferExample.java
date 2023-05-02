package learnings.basic;

public class StringBufferExample {

    public static void main(String args[]) {
        StringBuffer buffer = new StringBuffer("string");

        //append - works as concatenation
        buffer.append(1234);
        buffer.append(1.2f);
        buffer.append(true);
        buffer.append("append");

        System.out.println(buffer);

        //insert - to insert string at an offset
        buffer.insert(0, 0);
        System.out.println(buffer);

        //to replace a string - replace, end is excluded
        buffer.replace(0, 6, "Harish");
        System.out.println(buffer);
        buffer.replace(buffer.length()-1, buffer.length(), "D");
        System.out.println(buffer);

        //delete - to delete
        buffer.delete(buffer.length()-1, buffer.length());
        System.out.println(buffer);

        //reverse
        System.out.println(buffer.reverse());

        //Substring - end index is excluded
        System.out.println(buffer.substring(2, 7));
    }
}
