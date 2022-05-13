public class smallestAndLargest {
    public static void main(String[] args) {
        int myarray[] = new int[] {1,6,3};
        int smallest = myarray[0];
        int largest = myarray[0];

        for (int i =1; i < myarray.length; i++) {
            if (myarray[i] >largest) {
                largest = myarray[i];
            }
            else {
                smallest = myarray[i];
            }
        }
        System.out.println("largest :"+  largest);
        System.out.println("smallest : " + smallest);
    }
}