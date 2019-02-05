import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args)
    {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        //display Original values
        System.out.print("Original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        //count, min, max, sum and average of the values
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        //find minimum
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());

        //find maximum
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());

        //sum of all values
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        //sum of average
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());
    }
}
