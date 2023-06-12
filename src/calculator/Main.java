package calculator;

import calculator.ComplexNumber.DecLogCompCalcFactory;
import calculator.ComplexNumber.ICompCalcFactory;
import calculator.ComplexNumber.ViewCompCalc;

public class Main {
    // public static void main(String[] args) {
    //     ICalculableFactory calculableFactory = new DecLogCalcFactory( new Logger());
    //     ViewCalculator view = new ViewCalculator(calculableFactory);
    //     view.run();
    // }

    public static void main(String[] args) {
        ICompCalcFactory compCalculableFactory = new DecLogCompCalcFactory( new Logger());
        ViewCompCalc view = new ViewCompCalc(compCalculableFactory);
        view.run();
    }
}
