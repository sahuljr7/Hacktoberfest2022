public class SwapPairsInString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String swappedString = swapPairs(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Swapped String: " + swappedString);
    }

    public static String swapPairs(String str) {
        char[] charArray = str.toCharArray();
        
        for (int i = 0; i < charArray.length - 1; i += 2) {
            char temp = charArray[i];
            charArray[i] = charArray[i + 1];
            charArray[i + 1] = temp;
        }
        
        return new String(charArray);
    }
}
