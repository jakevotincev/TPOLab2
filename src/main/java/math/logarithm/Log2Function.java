package math.logarithm;

import math.MathFunction;

public interface Log2Function extends MathFunction {
    Double log2(Double x);

    @Override
    default Double evaluate(Double arg) {
        return log2(arg);
    }
}
