public class Ques10 {

    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // append()
        stringBuffer.append(" World");
        System.out.println("After append(): " + stringBuffer);

        // capacity()
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity: " + capacity);

        // charAt()
        char charAtIndex2 = stringBuffer.charAt(2);
        System.out.println("Character at index 2: " + charAtIndex2);

        // delete()
        stringBuffer.delete(1, 3);
        System.out.println("After delete(1, 3): " + stringBuffer);

        // deleteCharAt()
        stringBuffer.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + stringBuffer);

        // ensureCapacity()
        stringBuffer.ensureCapacity(20);
        System.out.println("After ensureCapacity(20): " + stringBuffer);

        // getChars()
        char[] charArray = new char[8];
        stringBuffer.getChars(0, 8, charArray, 0);
        System.out.println("getChars Result: " + new String(charArray));

        // indexOf()
        int indexOfSubstring = stringBuffer.indexOf("lo");
        System.out.println("Index of 'lo': " + indexOfSubstring);

        // insert()
        stringBuffer.insert(6, " Java");
        System.out.println("After insert(6, ' Java'): " + stringBuffer);

        // length()
        int lengthOfStringBuffer = stringBuffer.length();
        System.out.println("Length of StringBuffer: " + lengthOfStringBuffer);

        // setCharAt()
        stringBuffer.setCharAt(0, 'h');
        System.out.println("After setCharAt(0, 'h'): " + stringBuffer);

        // setLength()
        stringBuffer.setLength(10);
        System.out.println("After setLength(10): " + stringBuffer);

        // substring()
        String substring = stringBuffer.substring(6);
        System.out.println("Substring from index 6: " + substring);

        // toString()
        String stringRepresentation = stringBuffer.toString();
        System.out.println("ToString Result: " + stringRepresentation);
    }
}
