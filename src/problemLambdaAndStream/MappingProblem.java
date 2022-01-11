package problemLambdaAndStream;

import java.util.Arrays;
import java.util.List;

public class MappingProblem {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream().map(integer -> integer * integer).toList();
        System.out.println(squaredNumbers);
        System.out.println("========================Q3===============================");

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);
        List<int[]> pairs = numbers1.stream()
            .flatMap(i -> numbers2.stream().map(j -> new int[]{i, j})).toList();

        pairs.forEach(pair -> System.out.print("(" + pair[0] + ", " + pair[1] + ")\t"));

        System.out.println("\n========================Q4===============================");

        pairs.stream().filter(pair -> (pair[0] + pair[1]) % 3 == 0)
            .forEach(pair -> System.out.print("(" + pair[0] + ", " + pair[1] + ")\t"));
        System.out.println("\n========================Q5===============================");

    }
}
