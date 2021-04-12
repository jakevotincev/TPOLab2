package math.trigonometry;

import math.MathFunction;

public interface CotFunction extends MathFunction {
    Double cot(Double x);

    @Override
    default Double evaluate(Double arg) {
        return cot(arg);
    }
}
