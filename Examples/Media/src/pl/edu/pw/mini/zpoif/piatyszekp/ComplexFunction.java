package pl.edu.pw.mini.zpoif.piatyszekp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ComplexFunction {
    public static List<Function<Double, Double>> getComplexFunction(){
        return Arrays.asList(x -> x*x + x*x*x, x -> Math.sin(x), x -> Math.abs(x));
    }

    public static Function<Double, Double> calculateValue(List<Function<Double, Double>> funs) {
        return x -> funs.stream().mapToDouble(f -> f.apply(x)).sum();
    }
}
