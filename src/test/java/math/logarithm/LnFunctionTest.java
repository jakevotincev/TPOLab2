package math.logarithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LnFunctionTest {
    private final double DELTA = 0.01;

    private static Stream<Double> getDataSet() {
        return Stream.of(0.0004, 0.05, 1.0, 2.0, Math.E, 5.0, 20.0, 1000.0);
    }

    private static Stream<Double> getExceptionValues() {
        return Stream.of(-1000.0, -2.0, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
    }

    @ParameterizedTest
    @MethodSource("getDataSet")
    void testOnTrueValues(double value) {
        LnFunction lnFunction = new LnFunctionImpl();
        assertEquals(Math.log(value), lnFunction.ln(value), DELTA);
    }

    @ParameterizedTest
    @MethodSource("getExceptionValues")
    void testOnExceptionValues(double value) {
        LnFunction lnFunction = new LnFunctionImpl();
        assertThrows(IllegalArgumentException.class, () -> lnFunction.ln(value));
    }

}
