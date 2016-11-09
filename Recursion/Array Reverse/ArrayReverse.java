import java.util.Arrays;
public class ArrayReverse {
    public static void main(String[] args) {
        int ary[] = {
            1, 2, -3, 40, 5, 9, 7
        };
        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(ary));
        arrayReverse(ary, 0, ary.length - 1);
        System.out.println("Reversed Array : ");
        System.out.println(Arrays.toString(ary));
    }
    /* Better Solution */
    public static void arrayReverse(int ary[], int i, int j) {
        if (i < j) {
            /* Swap the Values */
            ary[i] = ary[i] + ary[j];
            ary[j] = ary[i] - ary[j];
            ary[i] = ary[i] - ary[j];

            arrayReverse(ary, i + 1, j - 1);
        }
    }
    /* Expensive Solution */
    public static void arrayReverse(int ary[], int n) {
        if (n == 0)
            return;
        else {
            int temp = ary[n - 1];
            arrayReverse(ary, n - 1);
            ary[ary.length - n] = temp;
        }
    }

}