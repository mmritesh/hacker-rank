package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by ritesh on 12/7/17.
 */
public class DynamicArray {
    public static void main(String[] args) {
        List<Integer>[] seqList;

        int N, Q, q, x, y, lastAns = 0, seqIndex;
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        Q= sc.nextInt();

        seqList = new List[N];

        for (int i = 0; i < Q ; i++) {
            q= sc.nextInt();
            x= sc.nextInt();
            y= sc.nextInt();

            seqIndex = (x ^ lastAns) % N;
            switch (q){
                case 1:
                    if (Objects.isNull(seqList[seqIndex]))
                        seqList[seqIndex] = new ArrayList<>();
                    seqList[seqIndex].add(y);
                    break;
                case 2:
                    lastAns = seqList[seqIndex].get(y % seqList[seqIndex].size());
                    System.out.println(lastAns);
                    break;
            }
        }
    }
}
