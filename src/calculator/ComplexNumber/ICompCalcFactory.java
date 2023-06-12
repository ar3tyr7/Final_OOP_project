package calculator.ComplexNumber;
// Интерфейс метода создагния аргумента комплексного числа
public interface ICompCalcFactory {
    ICompCalculable create(double rArg, double iArg);
}
