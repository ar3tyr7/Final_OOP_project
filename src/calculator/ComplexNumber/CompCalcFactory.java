package calculator.ComplexNumber;
public class CompCalcFactory {
    public ICompCalculable create(double rArg, double iArg) {
        return new CompCalculator(rArg,iArg);
    }
}
