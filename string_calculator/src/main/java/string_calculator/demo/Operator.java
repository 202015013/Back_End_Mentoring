package string_calculator.demo;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Operator {
    PLUS("+") {
        double calculate(double result, String x) { return result + Double.parseDouble(x); }
    },
    DIVIDE("/") {
        double calculate(double result, String x) { return result / Double.parseDouble(x); }
    },
    MULTIPLE("*") {
        double calculate(double result, String x) { return result * Double.parseDouble(x); }
    },
    SUBSTRACT("-") {
        double calculate(double result, String x) { return result - Double.parseDouble(x); }
    };
    private String code;
    private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(
            Stream.of(values()).collect(Collectors.toMap(Operator::getCode, Operator::name)));

    private String getCode() {
        return this.code;
    }

    abstract double calculate(double result, String x);
    Operator(String symbol) {
        this.code = symbol;
    }

    public static Operator of(String code) {
        return Operator.valueOf(CODE_MAP.get(code));
    }
}
