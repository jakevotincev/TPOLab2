import math.FunctionSystem;
import math.logarithm.*;
import math.trigonometry.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import stub.logarithm.LnFunctionImplStub;
import stub.logarithm.Log2FunctionImplStub;
import stub.logarithm.Log3FunctionImplStub;
import stub.logarithm.Log5FunctionImplStub;
import stub.trigonometry.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    private final double DELTA = 0.01;


    @ParameterizedTest
    @CsvFileSource(resources = "/funcSysDataSet.csv")
    void testFuncSysOnStubs(double arg, double expected) {
        CosFunction cosFunction = new CosFunctionImplStub();
        CotFunction cotFunction = new CotFunctionImplStub();
        CscFunction cscFunction = new CscFunctionImplStub();
        SecFunction secFunction = new SecFunctionImplStub();
        SinFunction sinFunction = new SinFunctionImplStub();
        TanFunction tanFunction = new TanFunctionImplStub();

        LnFunction lnFunction = new LnFunctionImplStub();
        Log2Function log2Function = new Log2FunctionImplStub();
        Log3Function log3Function = new Log3FunctionImplStub();
        Log5Function log5Function = new Log5FunctionImplStub();

        FunctionSystem functionSystem = new FunctionSystem(lnFunction,
                log2Function,
                log3Function,
                log5Function,
                cosFunction,
                cotFunction,
                cscFunction,
                secFunction,
                sinFunction,
                tanFunction);
        assertEquals(expected, functionSystem.evaluate(arg), DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/funcSysDataSet.csv")
    void testFuncSysWithSinImpl(double arg, double expected) {
        CosFunction cosFunction = new CosFunctionImplStub();
        CotFunction cotFunction = new CotFunctionImplStub();
        CscFunction cscFunction = new CscFunctionImplStub();
        SecFunction secFunction = new SecFunctionImplStub();
        SinFunction sinFunction = new SinFunctionImpl();
        TanFunction tanFunction = new TanFunctionImplStub();

        LnFunction lnFunction = new LnFunctionImplStub();
        Log2Function log2Function = new Log2FunctionImplStub();
        Log3Function log3Function = new Log3FunctionImplStub();
        Log5Function log5Function = new Log5FunctionImplStub();

        FunctionSystem functionSystem = new FunctionSystem(lnFunction,
                log2Function,
                log3Function,
                log5Function,
                cosFunction,
                cotFunction,
                cscFunction,
                secFunction,
                sinFunction,
                tanFunction);
        assertEquals(expected, functionSystem.evaluate(arg), DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/funcSysDataSet.csv")
    void testFuncSysWithSinAndLnImpl(double arg, double expected) {
        CosFunction cosFunction = new CosFunctionImplStub();
        CotFunction cotFunction = new CotFunctionImplStub();
        CscFunction cscFunction = new CscFunctionImplStub();
        SecFunction secFunction = new SecFunctionImplStub();
        SinFunction sinFunction = new SinFunctionImpl();
        TanFunction tanFunction = new TanFunctionImplStub();

        LnFunction lnFunction = new LnFunctionImpl();
        Log2Function log2Function = new Log2FunctionImplStub();
        Log3Function log3Function = new Log3FunctionImplStub();
        Log5Function log5Function = new Log5FunctionImplStub();

        FunctionSystem functionSystem = new FunctionSystem(lnFunction,
                log2Function,
                log3Function,
                log5Function,
                cosFunction,
                cotFunction,
                cscFunction,
                secFunction,
                sinFunction,
                tanFunction);
        assertEquals(expected, functionSystem.evaluate(arg), DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/funcSysDataSet.csv")
    void testFuncSysWithoutStubs(double arg, double expected) {
        SinFunction sinFunction = new SinFunctionImpl();
        CosFunction cosFunction = new CosFunctionImpl(sinFunction);
        TanFunction tanFunction = new TanFunctionImpl(cosFunction, sinFunction);
        CotFunction cotFunction = new CotFunctionImpl(tanFunction);
        CscFunction cscFunction = new CscFunctionImpl(sinFunction);
        SecFunction secFunction = new SecFunctionImpl(cosFunction);

        LnFunction lnFunction = new LnFunctionImpl();
        Log2Function log2Function = new Log2FunctionImpl(lnFunction);
        Log3Function log3Function = new Log3FunctionImpl(lnFunction);
        Log5Function log5Function = new Log5FunctionImpl(lnFunction);

        FunctionSystem functionSystem = new FunctionSystem(lnFunction,
                log2Function,
                log3Function,
                log5Function,
                cosFunction,
                cotFunction,
                cscFunction,
                secFunction,
                sinFunction,
                tanFunction);
        assertEquals(expected, functionSystem.evaluate(arg), DELTA);
    }

}
