package calculator;

public final class Calculator implements ICalculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public ICalculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public ICalculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
