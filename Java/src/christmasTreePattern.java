public class christmasTreePattern {
    public static void main(String[] args) {
        int noOfRows = 4;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = i; j <= noOfRows+1; j++) {
                System.out.print("  ");
            }
            for (int k = 1;k < i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int m = 1; m <= noOfRows; m++) {
            for (int n = m; n <= noOfRows; n++) {
                System.out.print("  ");
            }
            for (int o = 1; o <= m+1; o++) {
                System.out.print("* ");
            }
            for (int p = 1; p <= m; p++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int q = 1; q <= noOfRows; q++) {
            for (int r = q; r <= noOfRows-1; r++) {
                System.out.print("  ");
            }
            for (int s = 1; s <= q+2; s++) {
                System.out.print("* ");
            }
            for (int t = 1; t <= q+1; t++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int u = 1; u <= noOfRows+3; u++) {
            for (int v = 1; v <= noOfRows; v++) {
                System.out.print("  ");
            }
            for (int w =1; w <= noOfRows-1; w++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
