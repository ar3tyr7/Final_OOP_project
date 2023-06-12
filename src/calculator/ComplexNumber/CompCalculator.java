package calculator.ComplexNumber;
// Перечень методов для основных действий с комплексными числами для калькулятора. 
import calculator.ILoggable;

public class CompCalculator implements ICompCalculable{
    
    private double realArg;
    private double imagineArg;
    public CompCalculator(double realArg, double imagineArg) {
        this.realArg = realArg;
        this.imagineArg = imagineArg;
    }

    @Override
    public ICompCalculable sum(double rArg, double iArg) {
        realArg+=rArg;
        imagineArg+=iArg;
        return this;
    }

    @Override
    public ICompCalculable multi(double rArg, double iArg) {
        double jfk = realArg;
        realArg = this.realArg*rArg-this.imagineArg*iArg;
        imagineArg = jfk*iArg+rArg*this.imagineArg;
        return this;
    }

    @Override
    public ComplexNumber getCompResult() {
        ComplexNumber jfk = new ComplexNumber(realArg, imagineArg);
        return jfk;
    }


    @Override
    public ICompCalculable devide(double rArg, double iArg) {
        double jfk= this.realArg;
        realArg = (this.realArg* rArg +this.imagineArg*iArg)/ (rArg*rArg+iArg*iArg);
        imagineArg = (rArg*this.imagineArg-jfk*iArg)/(rArg*rArg+iArg*iArg);
        return this;
    }
    
}
