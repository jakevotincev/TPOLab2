package math.trigonometry;

public class CscFunctionImpl implements CscFunction {
    private final SinFunction sinFunction;

    public CscFunctionImpl(SinFunction sinFunction) {
        this.sinFunction = sinFunction;
    }

    public CscFunctionImpl() {
        sinFunction = new SinFunctionImpl();
    }

    @Override
    public Double csc(Double x) {
        return 1 / sinFunction.sin(x);
    }
}
