package math.trigonometry;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SinFunctionImplTest {
    private final double DELTA = 0.01;

    private static Stream<Double> getDataSet() {
        return Stream.of(-5 * Math.PI / 2, -Math.PI, -Math.PI / 2, -Math.PI / 4, 0.0, Math.PI / 4, Math.PI / 2, Math.PI, 5 * Math.PI / 2
        );
    }

    private static Stream<Double> getExceptionDataSet() {
        return Stream.of(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN);
    }


    @ParameterizedTest
    @MethodSource("getDataSet")
    void testOnTrueValues(double value) {
        SinFunction sinFunction = new SinFunctionImpl();
        assertEquals(Math.sin(value), sinFunction.sin(value), DELTA);
    }

    @ParameterizedTest
    @MethodSource("getExceptionDataSet")
    void testOnExceptionValues(double value) {
        SinFunction sinFunction = new SinFunctionImpl();
        assertThrows(IllegalArgumentException.class, () -> sinFunction.sin(value));
    }
}
