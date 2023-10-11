public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using the equals() method
        boolean isEqualUsingEquals = str1.equals(str2);
        System.out.println("Comparison using equals(): " + isEqualUsingEquals);

        // Using the compareTo() method
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult < 0) {
            System.out.println("Comparison using compareTo(): str1 comes before str2");
        } else if (comparisonResult > 0) {
            System.out.println("Comparison using compareTo(): str1 comes after str2");
        } else {
            System.out.println("Comparison using compareTo(): str1 and str2 are equal");
        }
    }
}
