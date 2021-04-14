package stub;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StubTables {
    private static final List<Double> trigonometryArgs = new ArrayList<>() {{
        add(0.0);
        add(-0.01);
        add(-0.1);
        add(-0.574);
        add(-0.75);
        add(-0.8);
        add(-1.5);
        add(-2.5);
        add(-3.0);
        add(-3.6);
        add(-3.977);
        add(-5.0);
        add(-5.51);
        add(-6.858);
        add(-8.0);
        add(-155.0);
        add(-10000.0);
    }};

    private static final List<Double> logarithmArgs = new ArrayList<>(){{
        add(0.01);
        add(0.1);
        add(0.1522);
        add(0.3);
        add(0.35);
        add(0.786);
        add(1.134);
        add(2.0);
        add(10.0);
        add(1000.0);
    }};

    public static final Map<Double, Double> sinArgToValue = trigonometryArgs.stream().collect(Collectors.toMap(x -> x, Math::sin));
    public static final Map<Double, Double> cosArgToValue = trigonometryArgs.stream().collect(Collectors.toMap(x -> x, Math::cos));
    public static final Map<Double, Double> tanArgToValue = trigonometryArgs.stream().collect(Collectors.toMap(x -> x, Math::tan));
    public static final Map<Double, Double> secArgToValue = trigonometryArgs.stream().collect(Collectors.toMap(x -> x, x -> 1 / Math.cos(x)));
    public static final Map<Double, Double> cscArgToValue = trigonometryArgs.stream().collect(Collectors.toMap(x -> x, x -> 1 / Math.sin(x)));
    public static final Map<Double, Double> cotArgToValue = trigonometryArgs.stream().collect(Collectors.toMap(x -> x, x -> 1 / Math.tan(x)));

    public static final Map<Double, Double> lnArgToValue = logarithmArgs.stream().collect(Collectors.toMap(x -> x, Math::log));
    public static final Map<Double, Double> log2ArgToValue = logarithmArgs.stream().collect(Collectors.toMap(x -> x, x -> Math.log(x) / Math.log(2)));
    public static final Map<Double, Double> log3ArgToValue = logarithmArgs.stream().collect(Collectors.toMap(x -> x, x -> Math.log(x) / Math.log(3)));
    public static final Map<Double, Double> log5ArgToValue = logarithmArgs.stream().collect(Collectors.toMap(x -> x, x -> Math.log(x) / Math.log(5)));


}
