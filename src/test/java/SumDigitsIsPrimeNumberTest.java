import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;


public class SumDigitsIsPrimeNumberTest {

    private SumDigitsIsPrimeNumber primeNumbers = new SumDigitsIsPrimeNumber();

    @Test
    public void should_return_all_numbers_below_30_with_a_sum_of_its_digits_is_prime_numbers() throws Exception {
        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);
        assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 10, 11, 12, 14, 16, 20, 21, 23, 25, 29, 30);
    }


    @Test
    public void should_sum_digit_return_1_in_case_of_1() {
        assertThat(primeNumbers.sum(1)).isEqualTo(1);
    }

    @Test
    public void should_sum_digit_return_0_in_case_of_0() {
        assertThat(primeNumbers.sum(0)).isEqualTo(0);
    }

    @Test
    public void should_sum_digit_return_1_in_case_of_10() {
        assertThat(primeNumbers.sum(10)).isEqualTo(1);
    }

    @Test
    public void should_sum_digit_return_27_in_case_of_999() {
        assertThat(primeNumbers.sum(999)).isEqualTo(27);
    }

    @Test
    public void should_sum_digit_return_10_in_case_of_1111111111() {
        assertThat(primeNumbers.sum(1111111111)).isEqualTo(10);
    }


    @Test
    public void should_return_is_prime_true_in_case_of_2() {
        assertTrue(primeNumbers.isPrime(2));
    }
    @Test
    public void should_return_is_prime_true_in_case_of_13() {
        assertTrue(primeNumbers.isPrime(13));
    }

    @Test
    public void should_return_is_prime_true_in_case_of_4() {
        assertFalse(primeNumbers.isPrime(4));
    }



}
