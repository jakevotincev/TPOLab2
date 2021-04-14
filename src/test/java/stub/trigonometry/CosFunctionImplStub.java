package stub.trigonometry;

import math.trigonometry.CosFunction;
import stub.StubTables;

public class CosFunctionImplStub implements CosFunction {
    @Override
    public Double cos(Double x) {
        return StubTables.cosArgToValue.get(x);
    }
}
