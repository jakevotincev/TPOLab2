package math.trigonometry;

public class TanFunctionImpl implements TanFunction {
    private final CosFunction cosFunction;
    private final SinFunction sinFunction;

    public TanFunctionImpl(CosFunction cosFunction, SinFunction sinFunction) {
        this.cosFunction = cosFunction;
        this.sinFunction = sinFunction;
    }

    public TanFunctionImpl() {
        cosFunction = new CosFunctionImpl();
        sinFunction = new SinFunctionImpl();
    }

    @Override
    public Double tan(Double x) {
        return sinFunction.sin(x) / cosFunction.cos(x);
    }
}
