package math.trigonometry;

import math.MathFunction;

public interface TanFunction extends MathFunction {
    Double tan(Double x);

    @Override
    default Double evaluate(Double arg) {
        return tan(arg);
    }
}
