package calculator.ComplexNumber;

import java.util.Scanner;

public class ViewCompCalc {

    private ICompCalcFactory compCalcFactory;

    public ViewCompCalc(ICompCalcFactory compCalcFactory) {
        this.compCalcFactory = compCalcFactory;
    }

    public void run() {
        while (true) {
            double rArg = promptDouble("Введите действительную часть комплексного числа: ");
            double iArg = promptDouble("Введите мнимую часть комплексного числа: ");
            ICompCalculable сompCalculator = compCalcFactory.create(rArg,iArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    double rArg2 = promptDouble("Введите действительную часть второго комплексного числа: ");
                    double iArg2 = promptDouble("Введите мнимую часть второго комплексного числа: ");
                    сompCalculator.multi(rArg2,iArg2);
                    continue;
                }
                if (cmd.equals("+")) {
                    double rArg2 = promptDouble("Введите действительную часть второго комплексного числа: ");
                    double iArg2 = promptDouble("Введите мнимую часть второго комплексного числа: ");
                    сompCalculator.sum(rArg2,iArg2);
                    continue;
                }
                if (cmd.equals("/")) {
                    double rArg2 = promptDouble("Введите действительную часть второго комплексного числа: ");
                    double iArg2 = promptDouble("Введите мнимую часть второго комплексного числа: ");
                    сompCalculator.devide(rArg2, iArg2);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = сompCalculator.getCompResult();
                    System.out.printf("Результат: %s \n", result.toString());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}


