public class hourGlassPattern {
    public static void main(String[] args) {
        int noOfRows = 5;
        for (int i=1 ; i <= noOfRows ; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k=i; k< noOfRows; k++) {
                System.out.print("* ");
            }
            for (int l=i; l <= noOfRows; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= noOfRows; i++) {
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
