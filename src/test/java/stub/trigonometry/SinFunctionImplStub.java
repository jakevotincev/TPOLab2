package stub.trigonometry;

import math.trigonometry.SinFunction;
import stub.StubTables;

public class SinFunctionImplStub implements SinFunction {
    @Override
    public Double sin(Double x) {
        return StubTables.sinArgToValue.get(x);
    }
}
