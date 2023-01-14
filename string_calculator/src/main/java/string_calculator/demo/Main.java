package string_calculator.demo;

public class Main {
    void run() {
        Input io = new Input();
        Calculator calculator = new Calculator();

        io.inputFormula();
        calculator.calculate();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}
