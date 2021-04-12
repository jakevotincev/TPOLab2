package math.trigonometry;

public class SecFunctionImpl implements SecFunction{
    private final CosFunction cosFunction;

    public SecFunctionImpl(CosFunction cosFunction) {
        this.cosFunction = cosFunction;
    }

    @Override
    public Double sec(Double x) {
        return 1/ cosFunction.cos(x);
    }
}
