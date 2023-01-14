package string_calculator.demo;

public class Calculator{
    final int NUMBER_FOR_CALCULATE = 1;
    final int NUMBER_FOR_FIND_OPERATOR = 2;
    public void calculate() {
        double result = 0;
        result += Double.parseDouble(Input.formula.get(0));

        for (int index = 1; index < Input.formula.size(); index += NUMBER_FOR_FIND_OPERATOR) {
            if (isNumber(Input.formula.get(index))) {
                System.out.println("입력오류");
            }
            String operatorInFormula =  Input.formula.get(index);
            Operator operator = Operator.of(operatorInFormula);
            result = operator.calculate(result, Input.formula.get(index + NUMBER_FOR_CALCULATE));
        }
        System.out.println(result);
    }
    boolean isNumber(String stringInFormula) {
        try {
            Double.parseDouble(stringInFormula);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
