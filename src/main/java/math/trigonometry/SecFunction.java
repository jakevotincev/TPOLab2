package math.trigonometry;

import math.MathFunction;

public interface SecFunction extends MathFunction {
    Double sec(Double x);

    @Override
    default Double evaluate(Double value) {
        return sec(value);
    }
}
