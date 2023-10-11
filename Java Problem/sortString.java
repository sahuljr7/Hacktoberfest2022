import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String input = "banana";
        String sortedString = sortString(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        
        // Sort the character array in lexicographical order
        Arrays.sort(charArray);
        
        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);
        
        return sortedString;
    }
}
