package stub.trigonometry;

import math.trigonometry.TanFunction;
import stub.StubTables;

public class TanFunctionImplStub implements TanFunction {
    @Override
    public Double tan(Double x) {
        return StubTables.tanArgToValue.get(x);
    }
}
