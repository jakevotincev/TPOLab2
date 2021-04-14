package math.trigonometry;

import math.MathFunction;

public interface CotFunction extends MathFunction {
    Double cot(Double x);

    @Override
    default Double evaluate(Double value) {
        return cot(value);
    }
}
