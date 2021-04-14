package math;

import math.logarithm.LnFunction;
import math.logarithm.Log2Function;
import math.logarithm.Log3Function;
import math.logarithm.Log5Function;
import math.trigonometry.*;

public class FunctionSystem {
    private final LnFunction lnFunction;
    private final Log2Function log2Function;
    private final Log3Function log3Function;
    private final Log5Function log5Function;
    private final CosFunction cosFunction;
    private final CotFunction cotFunction;
    private final CscFunction cscFunction;
    private final SecFunction secFunction;
    private final SinFunction sinFunction;
    private final TanFunction tanFunction;

    public FunctionSystem(LnFunction lnFunction,
                          Log2Function log2Function,
                          Log3Function log3Function,
                          Log5Function log5Function,
                          CosFunction cosFunction,
                          CotFunction cotFunction,
                          CscFunction cscFunction,
                          SecFunction secFunction,
                          SinFunction sinFunction,
                          TanFunction tanFunction) {
        this.lnFunction = lnFunction;
        this.log2Function = log2Function;
        this.log3Function = log3Function;
        this.log5Function = log5Function;
        this.cosFunction = cosFunction;
        this.cotFunction = cotFunction;
        this.cscFunction = cscFunction;
        this.secFunction = secFunction;
        this.sinFunction = sinFunction;
        this.tanFunction = tanFunction;
    }

    public Double evaluate(Double x) {
        if (x <= 0) {
            double cos = cosFunction.cos(x);
            double cot = cotFunction.cot(x);
            double csc = cscFunction.csc(x);
            double sec = secFunction.sec(x);
            double sin = sinFunction.sin(x);
            double tan = tanFunction.tan(x);
            return ((((Math.pow(((((((((Math.pow(csc, 2) + cos) + sec) / cos) / sec) / sin) +
                    (tan + (sin / ((csc * sin) - cos)))) / sec) - (cot + sec)), 3) /
                    (sin * Math.pow((((sec - sin) * tan) + csc), 2))) * Math.pow(sec, 2)) +
                    (cos * Math.pow(cos, 3))) / Math.pow(((Math.pow(((tan - cos) / (cos * (cot * sec))), 3) + csc) -
                    ((cot - cos) * (tan + csc))), 3));

        } else {
            double ln = lnFunction.ln(x);
            double log2 = log2Function.log2(x);
            double log3 = log3Function.log3(x);
            double log5 = log5Function.log5(x);
            return (((((ln * ln) - log3) + ln) / ((log5 + log3) + (log2 * ln))) - ln);
        }
    }
}
