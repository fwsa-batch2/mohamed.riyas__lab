public class rightPascalTriangle {
    public static void main(String[] args) {
        int noOfRows = 5;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 1; k <= noOfRows;k++) {
            for (int l = k; l <= noOfRows; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
