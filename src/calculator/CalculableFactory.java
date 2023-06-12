package calculator;

public class CalculableFactory implements ICalculableFactory {
    public ICalculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
