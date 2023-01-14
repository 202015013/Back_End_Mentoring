package string_calculator.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    static List<String> formula;
    public void inputFormula() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("write formula : ");
        splitFormula(scanner.nextLine());
    }
    public void splitFormula(String formula) {
        String[] splitFormula = formula.split(" ");
        Input.formula = new ArrayList<>(List.of(splitFormula));
    }
}
