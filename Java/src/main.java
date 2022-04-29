
public class main {

	public static void main(String[] args) {
         int factNum = 145;
        String mychar = Integer.toString(factNum);
        int lenOfMychar = mychar.length();
        int num1;
        int num2 = 0;
        for(int i=0; i < lenOfMychar; i++) {
            char singleChar = mychar.charAt(i);
            int charToNumbers = Character.getNumericValue(singleChar);
            num1=1;
            for (int j = 1; j <= charToNumbers; j++) {
                num1 = num1 * j;
            }
            num2 = num2 + num1;
        }
        System.out.println(num2);
	}
}