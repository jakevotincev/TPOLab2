package math.logarithm;

import math.MathFunction;

public interface Log3Function extends MathFunction {
    Double log3(Double x);

    @Override
    default Double evaluate(Double arg) {
        return log3(arg);
    }
}
