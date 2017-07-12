package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ritesh on 12/7/17.
 */
public class LeftRotation {
    public static void main(String[] args) {
        int n, d;
        List<Integer> tempList, finalList;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();

        tempList = new ArrayList<>(d);
        finalList = new ArrayList<>(n);

        for (int i = 0; i < d ; i++)
            tempList.add(sc.nextInt());

        for (int i = d; i < n; i++)
            finalList.add(sc.nextInt());

        finalList.addAll(tempList);

        finalList.forEach(num -> System.out.print(num + " "));
    }
}
