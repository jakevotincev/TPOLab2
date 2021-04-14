import math.MathFunction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CsvFilePrinter {
    public static void print(MathFunction function, double pointFrom, double pointTo, double step, String csvDelimiter, String filename) {
        if (pointFrom > pointTo) {
            throw new IllegalArgumentException("From point can't be greater to point");
        }
        Path filePath = Paths.get(filename);
        try {
            Files.deleteIfExists(filePath);
            Files.createFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        for (double x = pointFrom; x <= pointTo; x += step) {
            Double result;
            try {
                result = function.evaluate(x);
            } catch (Exception e) {
                result = Double.NaN;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(x);
            stringBuilder.append(csvDelimiter);
            stringBuilder.append(result.doubleValue());
            stringBuilder.append("\n");
            try {
                Files.writeString(filePath, stringBuilder.toString(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.err.println("Can't write to file:");
                System.err.println(stringBuilder);
                e.printStackTrace();
            }
        }
    }

}
