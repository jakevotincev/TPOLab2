package math.trigonometry;

public class SecFunctionImpl implements SecFunction{
    private final CosFunction cosFunction;

    public SecFunctionImpl(CosFunction cosFunction) {
        this.cosFunction = cosFunction;
    }

    public SecFunctionImpl() {
        cosFunction = new CosFunctionImpl();
    }

    @Override
    public Double sec(Double x) {
        return 1/ cosFunction.cos(x);
    }
}
