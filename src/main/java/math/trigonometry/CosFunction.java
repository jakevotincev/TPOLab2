package math.trigonometry;

import math.MathFunction;

public interface CosFunction  extends MathFunction {
    Double cos(Double x);

    @Override
    default Double evaluate(Double value) {
        return cos(value);
    }
}
