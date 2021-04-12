package math.trigonometry;

public class SinFunctionImpl implements SinFunction {

    @Override
    public Double sin(Double x) {
        if (x.isNaN() || x.isInfinite()) {
            throw new IllegalArgumentException("Invalid argument: " + x);
        }

        if (x >= Math.PI) {
            while (x >= Math.PI) {
                x -= 2 * Math.PI;
            }
        } else if (x <= -Math.PI) {
            while (x <= -Math.PI) {
                x += 2 * Math.PI;
            }
        }

        double result = 0;
        double pow = x;
        long fact = 1;
        short sign = 1;

        for (int i = 1; i < 100; i++) {
            result += sign * pow / fact;
            sign *= -1;
            pow *= x * x;
            fact *= (long) (i * 2) * (i * 2 + 1);
        }

        return result;
    }
}
