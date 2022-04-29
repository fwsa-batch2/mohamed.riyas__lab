public class hillPattern {
    public static void main(String[] args) {
        int noOfRows = 5;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = i; j <= noOfRows; j++ ) {
                System.out.print("  ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
