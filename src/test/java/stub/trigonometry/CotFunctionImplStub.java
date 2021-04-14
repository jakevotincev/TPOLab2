package stub.trigonometry;

import math.trigonometry.CotFunction;
import stub.StubTables;

public class CotFunctionImplStub implements CotFunction {
    @Override
    public Double cot(Double x) {
        return StubTables.cotArgToValue.get(x);
    }
}
