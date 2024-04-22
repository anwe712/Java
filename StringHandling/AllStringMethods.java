package StringHandling;

public class AllStringMethods {
    public static void main(String[] args) {
        // Example string
        String str = "Hello, World!";

        // charAt() method
        char ch = str.charAt(7);
        System.out.println("charAt(7): " + ch);

        // compareTo() method
        String str2 = "Hello, World!";
        int result = str.compareTo(str2);
        System.out.println("compareTo(str2): " + result);

        // equals() method
        boolean isEqual = str.equals(str2);
        System.out.println("equals(str2): " + isEqual);

        // equalsIgnoreCase() method
        String str3 = "HELLO, world!";
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str3);
        System.out.println("equalsIgnoreCase(str3): " + isEqualIgnoreCase);

        // indexOf() method
        int index = str.indexOf('o');
        System.out.println("indexOf('o'): " + index);

        // length() method
        int length = str.length();
        System.out.println("length(): " + length);

        // substring() method
        String substr = str.substring(7);
        System.out.println("substring(7): " + substr);

        // toCharArray() method
        char[] charArray = str.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // toLowerCase() method
        String lowercase = str.toLowerCase();
        System.out.println("toLowerCase(): " + lowercase);

        // toString() method (implicitly called)
        String str4 = "Hello";
        String str5 = str4; // implicit toString() call
        System.out.println("toString(): " + str5);

        // toUpperCase() method
        String uppercase = str.toUpperCase();
        System.out.println("toUpperCase(): " + uppercase);

        // trim() method
        String str6 = "   Hello, World!   ";
        String trimmed = str6.trim();
        System.out.println("trim(): \"" + trimmed + "\"");

        // valueOf() method
        int num = 123;
        String strNum = String.valueOf(num);
        System.out.println("valueOf(num): " + strNum);
    }

}
