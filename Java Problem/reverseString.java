public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        StringBuilder reversed = new StringBuilder(input).reverse();
        String result = reversed.toString();
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}
