package stub.logarithm;

import math.logarithm.LnFunction;
import stub.StubTables;

public class LnFunctionImplStub implements LnFunction {
    @Override
    public Double ln(Double x) {
        return StubTables.lnArgToValue.get(x);
    }
}
