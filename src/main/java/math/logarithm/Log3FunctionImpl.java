package math.logarithm;

public class Log3FunctionImpl implements Log3Function {
    private final LnFunction lnFunction;

    public Log3FunctionImpl(LnFunction lnFunction) {
        this.lnFunction = lnFunction;
    }

    @Override
    public Double log3(Double x) {
        return lnFunction.ln(x) / lnFunction.ln(3.0);
    }
}
