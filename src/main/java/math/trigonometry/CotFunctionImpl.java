package math.trigonometry;

public class CotFunctionImpl implements CotFunction{
    private final TanFunction tanFunction;

    public CotFunctionImpl(TanFunction tanFunction) {
        this.tanFunction = tanFunction;
    }

    public CotFunctionImpl() {
        tanFunction = new TanFunctionImpl(new CosFunctionImpl(), new SinFunctionImpl());
    }

    @Override
    public Double cot(Double x) {
        return 1/ tanFunction.tan(x);
    }
}
