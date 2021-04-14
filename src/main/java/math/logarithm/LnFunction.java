package math.logarithm;

import math.MathFunction;

public interface LnFunction  extends MathFunction {
    Double ln(Double x);

    @Override
    default Double evaluate(Double value){
        return ln(value);
    };
}
