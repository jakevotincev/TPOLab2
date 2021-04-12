package math.trigonometry;

public class CosFunctionImpl implements CosFunction {
    private final SinFunction sinFunction;

    public CosFunctionImpl(SinFunction sinFunction) {
        this.sinFunction = sinFunction;
    }


    @Override
    public Double cos(Double x) {
        return sinFunction.sin(x + Math.PI / 2);
    }
}
