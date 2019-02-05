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

        //Sum of values with reduce lamda version
        System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce(0,(x, y) -> x + y));

        //sum of squares of each value
        System.out.printf("%nSum of squares: %d%n", IntStream.of(values).reduce(0,(x,y) -> x + y*y));

        //product of values with reduce method
        System.out.printf("%nProduct: %d%n", IntStream.of(values).reduce(1,(x,y) -> x*y));

        //even values displayed in sorted order
        System.out.printf("%nEven values in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d ",value));
        System.out.println();

        //odd values multiplied by 10 and displayed in sorted ordered
        System.out.printf("%nOdd values multiplied by 10 and sorted: ");
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value*10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        //sum range of integers from 1 to 10. exclusive
        System.out.printf("%nSum of integers form 1 to 9: %d%n",
                IntStream.range(1,10).sum());
        
        //sum range of integers from 1 to 10, inclusive
        System.out.printf("%nSum of int 1 to 10: %d%n",
                IntStream.rangeClosed(1,10).sum());

    }
}
