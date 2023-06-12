package calculator;

public class DecLogCalcFactory implements ICalculableFactory {
    private ILoggable logger;
    public DecLogCalcFactory(ILoggable logger) {
        this.logger = logger;
    }
    public ICalculable create(int primaryArg) {
        return new DecLogCalc(new Calculator(primaryArg),logger);
    }
    
}
