import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by ritesh on 5/7/17.
 */
public class ArraysDS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int N = sc.nextInt(), i;
        int[] a = new int[N];

        for (i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        for (i = N-1; i >= 1 ; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[i]);
    }
}
