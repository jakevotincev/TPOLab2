package math.logarithm;

import math.MathFunction;

public interface Log5Function extends MathFunction {
    Double log5(Double x);

    @Override
    default Double evaluate(Double value) {
        return log5(value);
    }
}
