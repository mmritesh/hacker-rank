package arrays;

import java.util.Scanner;

/**
 * Created by ritesh on 17/7/17.
 */
public class AlgorithmicCrush {

    public static void main(String[] args) {
        int N,M, a, b;
        long k, max = 0, sum = 0;
        long[] array;

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        array = new long[N+1];

        for (int i = 0; i < M; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextLong();

            array[a-1] += k;
            array[b] -= k;
        }
        for (int i = 0; i < N; i++) {
            sum += array[i];
            if (sum > max)
                max = sum;
        }
        System.out.println(max);
    }
}
