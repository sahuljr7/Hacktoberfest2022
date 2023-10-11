public class PascalTriangleStars {
    public static void main(String[] args) {
        int numRows = 5; // Change this value to adjust the number of rows

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" "); // Print spaces for formatting
            }

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Print asterisks
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
