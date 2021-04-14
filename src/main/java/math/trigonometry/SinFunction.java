package math.trigonometry;

import math.MathFunction;

public interface SinFunction extends MathFunction {
    Double sin(Double x);

    @Override
    default Double evaluate(Double value) {
        return sin(value);
    }
}
