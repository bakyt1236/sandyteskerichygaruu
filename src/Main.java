public class Main {

    public static void main(String[] args) {
        reverse(-123);
    }

    public static void reverse(int x) {
        int empty = 0;
        boolean restrictionsNumber = x >= 999;
        boolean restrictionsUnNumber = x <= -999;
        if (restrictionsNumber || restrictionsUnNumber) {
            System.out.println(empty);
            return;
        }
        if (x > 0) {
            String stringInput = String.valueOf(x);
            char[] resultArray = stringInput.toCharArray();
            for (int i = resultArray.length - 1; i >= 0; i--)
                System.out.print(resultArray[i]);
        } else if (x < 0) {
            String string = String.valueOf(x).substring(1);
            char[] array = string.toCharArray();

            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
            }
        }
    }
}