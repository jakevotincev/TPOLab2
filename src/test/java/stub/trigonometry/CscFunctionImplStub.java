package stub.trigonometry;

import math.trigonometry.CscFunction;
import stub.StubTables;

public class CscFunctionImplStub implements CscFunction {
    @Override
    public Double csc(Double x) {
        return StubTables.cscArgToValue.get(x);
    }
}
