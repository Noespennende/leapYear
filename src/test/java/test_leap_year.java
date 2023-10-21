import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class test_leap_year {

    @ParameterizedTest
    @MethodSource({"leap_years_divisible_by_4_but_not_100"})

    public void return_true_if_leap_year_divisible_by_4_but_not_100(int input){
        assertTrue(leap_year.isLeapYear(input));
    }

    public static Stream leap_years_divisible_by_4_but_not_100(){
        return Stream.of(
                Arguments.of(2004),
                Arguments.of(2008),
                Arguments.of(2012),
                Arguments.of(2016)
        );
    }

    @ParameterizedTest
    @MethodSource({"leap_years_divisible_by_400"})

    public void return_true_if_leap_year_divisible_by_400(int input){
        assertTrue(leap_year.isLeapYear(input));
    }

    public static Stream leap_years_divisible_by_400(){
        return Stream.of(
                Arguments.of(800),
                Arguments.of(2000),
                Arguments.of(2400),
                Arguments.of(2800),
                Arguments.of(3200)
        );
    }

    @ParameterizedTest
    @MethodSource("not_leap_years_not_divisible_by_4")

    public void return_false_if_not_leap_year_is_not_divisible_by_4(int input){
        assertFalse(leap_year.isLeapYear(input));
    }

    public static Stream not_leap_years_not_divisible_by_4() {
        return Stream.of(
                Arguments.of(2001),
                Arguments.of(1999),
                Arguments.of(2023),
                Arguments.of(2025),
                Arguments.of(2027),
                Arguments.of(2029),
                Arguments.of(2031),
                Arguments.of(2033),
                Arguments.of(2016) //slett denne
        );
    }

        @ParameterizedTest
        @MethodSource("not_leap_years_divisible_by_100_but_not_400")

        public void return_false_if_not_leap_year_is_divisible_by_100_but_not_400(int input){
            assertFalse(leap_year.isLeapYear(input));
        }

        public static Stream not_leap_years_divisible_by_100_but_not_400(){
            return Stream.of(
                    Arguments.of(700),
                    Arguments.of(1000),
                    Arguments.of(1700),
                    Arguments.of(1800),
                    Arguments.of(1900),
                    Arguments.of(2100)
            );
    }

}
