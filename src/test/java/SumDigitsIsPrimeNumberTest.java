import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;


public class SumDigitsIsPrimeNumberTest {

    @Test
    public void should_return_all_numbers_below_30_with_a_sum_of_its_digits_is_a_prime_number() throws Exception {
        SumDigitsIsPrimeNumber primeNumbers = new SumDigitsIsPrimeNumber();
        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);
        Assertions.assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 10, 11, 12, 14, 16, 20, 21, 23, 25, 29, 30);
    }
}
