package calculator;
// Добавление класса декоратора (паттерн), который объединяет в себе основные методы калькулятора 
//и добавляет логирование

public class DecLogCalc implements ICalculable{
private ICalculable decorated;
private ILoggable logger; 


    public DecLogCalc(ICalculable decorated, ILoggable logger) {
    this.decorated = decorated;
    this.logger = logger;
}

    @Override
    public ICalculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d . Начало вызова метода суммы", firstArg));
        ICalculable result = decorated.sum(arg);
        logger.log(String.format("Вызов метода sum  произошел"));
        return result;
    }

    @Override
    public ICalculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log(String.format("Первое значение калькулятора %d . Начало вызова метода умножения", firstArg));
        ICalculable result = decorated.sum(arg);
        logger.log(String.format("Вызов метода multi  произошел"));
        return result;
    }

    @Override
    public int getResult() { 
        int result = decorated.getResult();
        logger.log(String.format("Получение результата %d . Начало вызова метода ", result));
        return result;
    }
    
}
