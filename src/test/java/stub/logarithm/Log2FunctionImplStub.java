package stub.logarithm;

import math.logarithm.Log2Function;
import stub.StubTables;

public class Log2FunctionImplStub implements Log2Function {
    @Override
    public Double log2(Double x) {
        return StubTables.log2ArgToValue.get(x);
    }
}
