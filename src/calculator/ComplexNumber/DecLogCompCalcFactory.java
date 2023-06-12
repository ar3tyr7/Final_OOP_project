package calculator.ComplexNumber;
// Фабрика деоратора.
import calculator.ILoggable;

public class DecLogCompCalcFactory implements ICompCalcFactory {
    private ILoggable logger;
    public DecLogCompCalcFactory(ILoggable logger) {
        this.logger = logger;
    }
    
    @Override
    public ICompCalculable create(double rArg, double iArg) {
        return new DecLogCompCalc(new CompCalculator(rArg,iArg),logger);
    }
}
