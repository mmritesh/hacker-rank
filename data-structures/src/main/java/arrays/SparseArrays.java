package arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ritesh on 12/7/17.
 */
public class SparseArrays {
    public static void main(String[] args) {
        int N, Q;
        String lookupString;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        List<String> values = new ArrayList<>(N);

        for (int i = 0; i < N; i++)
            values.add(sc.next());

        Q = sc.nextInt();

        Map<String, Long> counts = values.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (int i = 0; i < Q; i++){
            lookupString = sc.next();
            Long ans = counts.get(lookupString);
            if (Objects.nonNull(ans))
                System.out.println(counts.get(lookupString));
            else
                System.out.println(0);
        }


    }
}
