import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.rangeClosed;

public class SumDigitsIsPrimeNumber {
    public List<Integer> calculate(int limit) {
        return rangeClosed(2, limit)
                .boxed()
                .filter(this::sumDigitsIsPrime)
                .collect(Collectors.toList());
    }

    private boolean sumDigitsIsPrime(Integer number) {
        return isPrime(sum(number));
    }

    private boolean isPrime(int number) {
        return !IntStream
                .range(2, number)
                .boxed()
                .anyMatch(ele -> number % ele == 0);
    }

    private int sum(int number) {
        return number % 10 + number / 10;
    }
}
