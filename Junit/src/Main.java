import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 7};
        arrayCheck2(arr);
    }

    public static int[] arrCheck(int[] arr) {
        int serchedNmb = 0;
        int[] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                serchedNmb = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = 0, k = i; j < result.length; j++, k++) {
                    result[j] = arr[k + 1];
                }
            }
        }
        try {
            serchedNmb = 1 / serchedNmb;
        } catch (ArithmeticException e) {
            throw new RuntimeException();
        }

        System.out.println(Arrays.toString(result));
        return result;
    }


    public static boolean arrayCheck2(int[] arr) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        return result;
    }

}
