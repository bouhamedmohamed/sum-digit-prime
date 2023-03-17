import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;


public class SumDigitsIsPrimeNumberTest {

    @Test
    public void should_return_all_numbers_below_30_with_a_sum_of_its_digits_is_prime_numbers() throws Exception {
        SumDigitsIsPrimeNumber primeNumbers = new SumDigitsIsPrimeNumber();
        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);
        Assertions.assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }
}
