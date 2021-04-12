package math.logarithm;

import math.MathFunction;

public interface Log5Function extends MathFunction {
    Double log5(Double x);

    @Override
    default Double evaluate(Double arg) {
        return log5(arg);
    }
}
