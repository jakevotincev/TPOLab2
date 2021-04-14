package stub.logarithm;

import math.logarithm.Log5Function;
import stub.StubTables;

public class Log5FunctionImplStub implements Log5Function {
    @Override
    public Double log5(Double x) {
        return StubTables.log5ArgToValue.get(x);
    }
}
