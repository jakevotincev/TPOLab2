import math.logarithm.LnFunctionImpl;
import math.logarithm.Log2FunctionImpl;
import math.logarithm.Log3FunctionImpl;
import math.logarithm.Log5FunctionImpl;
import math.trigonometry.*;

public class Main {
    public static void main(String[] args) {
        CsvFilePrinter.print(new SinFunctionImpl(), -Math.PI, Math.PI, Math.PI / 4, ";", "sin.csv");
        CsvFilePrinter.print(new CosFunctionImpl(), -Math.PI, Math.PI, Math.PI / 4, ";", "cos.csv");
        CsvFilePrinter.print(new SecFunctionImpl(), -Math.PI, Math.PI, Math.PI / 4, ";", "sec.csv");
        CsvFilePrinter.print(new CscFunctionImpl(), -Math.PI, Math.PI, Math.PI / 4, ";", "csc.csv");
        CsvFilePrinter.print(new TanFunctionImpl(), -Math.PI, Math.PI, Math.PI / 4, ";", "tan.csv");
        CsvFilePrinter.print(new CotFunctionImpl(), -Math.PI, Math.PI, Math.PI / 4, ";", "cot.csv");
        CsvFilePrinter.print(new LnFunctionImpl(), 0.1, 10.0, 0.1, ";", "ln.csv");
        CsvFilePrinter.print(new Log2FunctionImpl(), 0.1, 10.0, 0.1, ";", "log2.csv");
        CsvFilePrinter.print(new Log3FunctionImpl(), 0.1, 10.0, 0.1, ";", "log3.csv");
        CsvFilePrinter.print(new Log5FunctionImpl(), 0.1, 10.0, 0.1, ";", "log10.csv");

    }
}
