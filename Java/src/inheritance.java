class triangle {
    public static void triangle() {
        int noOfRows = 5;
        for (int i = 1; i < noOfRows; i++) {
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
class diamond extends triangle {
    public static void diamond() {
        int rows = 5;
        for (int r = 1; r <= rows; r++) {
            for (int s = 1; s <= r; s++) {
                System.out.print("  ");
            }
            for (int q = r; q < rows; q++) {
                System.out.print("* ");
            }
            for (int c = r; c <= rows; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class inheritance extends diamond{
    public static void main(String[] args) {
        triangle();
        diamond();
    }
}