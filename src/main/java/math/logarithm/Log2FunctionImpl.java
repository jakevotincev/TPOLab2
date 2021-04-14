package math.logarithm;

public class Log2FunctionImpl implements Log2Function {
    private final LnFunction lnFunction;

    public Log2FunctionImpl(LnFunction lnFunction) {
        this.lnFunction = lnFunction;
    }

    public Log2FunctionImpl() {
        lnFunction = new LnFunctionImpl();
    }

    @Override
    public Double log2(Double x) {
        return lnFunction.ln(x) / lnFunction.ln(2.0);
    }
}
