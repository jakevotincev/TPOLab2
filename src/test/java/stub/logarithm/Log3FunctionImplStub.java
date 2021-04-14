package stub.logarithm;

import math.logarithm.Log3Function;
import stub.StubTables;

public class Log3FunctionImplStub implements Log3Function {
    @Override
    public Double log3(Double x) {
        return StubTables.log3ArgToValue.get(x);
    }
}
