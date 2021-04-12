package math.logarithm;

public class Log5FunctionImpl implements Log5Function {
    private final LnFunction lnFunction;

    public Log5FunctionImpl(LnFunction lnFunction) {
        this.lnFunction = lnFunction;
    }

    @Override
    public Double log5(Double x) {
        return lnFunction.ln(x) / lnFunction.ln(5.0);
    }
}
