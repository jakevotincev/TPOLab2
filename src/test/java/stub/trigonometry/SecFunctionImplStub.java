package stub.trigonometry;

import math.trigonometry.SecFunction;
import stub.StubTables;

public class SecFunctionImplStub implements SecFunction {
    @Override
    public Double sec(Double x) {
        return StubTables.secArgToValue.get(x);
    }
}
