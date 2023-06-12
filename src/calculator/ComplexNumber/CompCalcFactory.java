package calculator.ComplexNumber;

//Паттерн фабрики для комплексного калькулятора. 
//Реализация метода создание комплексного аргумента для калькулятора
public class CompCalcFactory {
    public ICompCalculable create(double rArg, double iArg) {
        return new CompCalculator(rArg,iArg);
    }
}
