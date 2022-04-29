public class leftDownwardTraingle {
    public static void main(String[] args) {
        int noOfRows = 5;
        for (int i = 1; i <= noOfRows; i++) {
            for(int j = 1 ; j <= i; j++) {
            System.out.print("  ");
        }
        for (int z = i;z <= noOfRows; z++) {
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}
