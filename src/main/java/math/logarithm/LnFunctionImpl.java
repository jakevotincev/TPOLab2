package math.logarithm;

public class LnFunctionImpl implements LnFunction {
    @Override
    public Double ln(Double x) {
        if (x <= 0.0 || x.isNaN() || x.isInfinite()) {
            throw new IllegalArgumentException("Invalid value: " + x);
        }
        if (x == 1.0) {
            return 0.0;
        }
        double arg = (x - 1) / (x + 1);
        double sum = 0.0;
        double pow = arg;
        for (int i = 1; i < 100; i += 2) {
            sum += pow / i;
            pow *= arg * arg;
        }
        return 2 * sum;

    }
}
