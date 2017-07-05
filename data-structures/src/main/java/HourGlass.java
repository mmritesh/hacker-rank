import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by ritesh on 5/7/17.
 */
public class HourGlass {
    public static void main(String[] args) {

        int row, col, ctr = 1, m = 6, n = 6, maxSum = -9999, sum = 0;
        int[][] arr = accept2DMatrix(m,n);

        for ( row = 0; row + 2 < m; row++) {
            ctr=1;
            for ( col = 0; col + 2 < n; col++) {
                sum = arr[row][col] + arr[row][col+1] + arr[row][col+2] +
                        arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2] +
                          arr[row+1][ctr];
                if (sum > maxSum)
                    maxSum = sum;
                ctr++;
            }
        }
        System.out.println(maxSum);

    }

    public static int[][] accept2DMatrix(int m, int n){
        int[][] arr = new int[m][n];

        Scanner sc = new Scanner(new InputStreamReader(System.in));

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
