package calculator.ComplexNumber;

import calculator.ILoggable;

public class DecLogCompCalc implements ICompCalculable{
    private ICompCalculable decorated;
    private ILoggable logger;


    public DecLogCompCalc(ICompCalculable decorated, ILoggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }
    
        @Override
        public ICompCalculable sum(double rArg, double iArg) {
            ComplexNumber firstArg = decorated.getCompResult();
            logger.log(String.format("Первое значение калькулятора %b . Начало вызова метода суммы", firstArg));
            ICompCalculable result = decorated.sum(rArg,iArg);
            logger.log(String.format("Вызов метода sum  произошел"));
            return result;
        }
    
        @Override
        public ICompCalculable multi(double rArg, double iArg) {
            ComplexNumber firstArg = decorated.getCompResult();
            logger.log(String.format("Первое значение калькулятора %b . Начало вызова метода умножения", firstArg));
            ICompCalculable result = decorated.multi(rArg,iArg);
            logger.log(String.format("Вызов метода multi  произошел"));
            return result;
        }

        @Override
        public ICompCalculable devide(double rArg, double iArg) {
            ComplexNumber firstArg = decorated.getCompResult();
            logger.log(String.format("Первое значение калькулятора %b . Начало вызова метода деления", firstArg));
            ICompCalculable result = decorated.devide(rArg,iArg);
            logger.log(String.format("Вызов метода devide  произошел"));
            return result;
        }

        @Override
        public ComplexNumber getCompResult() { 
            ComplexNumber result = decorated.getCompResult();
            logger.log(String.format("Получение результата %b . Начало вызова метода ", result));
            return result;
        }

        
}
    


