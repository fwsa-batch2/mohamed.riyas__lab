public class leftTriangle {
    public static void main(String[] args) {
        int noOfRows = 5;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = i; j <= noOfRows; j++) {
                System.out.print("  ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println();
    }
    }
    }