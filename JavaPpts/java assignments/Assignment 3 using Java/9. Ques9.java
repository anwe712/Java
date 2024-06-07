public class Ques9 {

    public static void main(String[] args) {
        // Immutable String
        String immutableString = "Hello";
        System.out.println("Immutable String: " + immutableString);

        // Mutable String (StringBuffer)
        StringBuffer mutableStringBuffer = new StringBuffer("Hello");
        System.out.println("Mutable String (StringBuffer): " + mutableStringBuffer);

        // Mutable String (StringBuilder)
        StringBuilder mutableStringBuilder = new StringBuilder("Hello");
        System.out.println("Mutable String (StringBuilder): " + mutableStringBuilder);

        // charAt()
        char charAtIndex2 = immutableString.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);

        // compareTo()
        int compareToResult = immutableString.compareTo("Hello");
        System.out.println("CompareTo Result: " + compareToResult);

        // equals()
        boolean isEqual = immutableString.equals("Hello");
        System.out.println("Equals Result: " + isEqual);

        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = immutableString.equalsIgnoreCase("hello");
        System.out.println("EqualsIgnoreCase Result: " + isEqualIgnoreCase);

        // indexOf()
        int indexOfChar = immutableString.indexOf('l');
        System.out.println("Index of 'l': " + indexOfChar);

        // length()
        int lengthOfString = immutableString.length();
        System.out.println("Length of String: " + lengthOfString);

        // substring()
        String substring = immutableString.substring(1, 4);
        System.out.println("Substring (1, 4): " + substring);

        // toCharArray()
        char[] charArray = immutableString.toCharArray();
        System.out.println("ToCharArray Result: " + new String(charArray));

        // toLowerCase()
        String lowercaseString = immutableString.toLowerCase();
        System.out.println("ToLowerCase Result: " + lowercaseString);

        // toString()
        String stringRepresentation = mutableStringBuffer.toString();
        System.out.println("ToString Result: " + stringRepresentation);

        // toUpperCase()
        String uppercaseString = immutableString.toUpperCase();
        System.out.println("ToUpperCase Result: " + uppercaseString);

        // trim()
        String stringWithWhitespace = "  Hello  ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trim Result: " + trimmedString);

        // valueOf()
        int intValue = 42;
        String stringValue = String.valueOf(intValue);
        System.out.println("ValueOf Result: " + stringValue);
    }
}
