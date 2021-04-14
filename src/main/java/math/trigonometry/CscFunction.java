package math.trigonometry;

import math.MathFunction;

public interface CscFunction extends MathFunction {
    Double csc(Double x);

    @Override
    default Double evaluate(Double value) {
        return csc(value);
    }
}
