package calculator.ComplexNumber;
// интерфейс основных действий комплексного числа
public interface ICompCalculable {
    ICompCalculable sum(double arg1, double arg2);
    ICompCalculable multi(double arg1, double arg2);
    ICompCalculable devide(double arg1, double arg2);
    ComplexNumber getCompResult();
}
