public class SquareStarPattern {
    public static void main(String[] args) {
        int rows = 5; // Change this value to adjust the size of the square

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
