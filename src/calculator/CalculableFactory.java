package calculator;
// Применение паттерна фабрика - продукт 
// Метод создание первого аргумента калькулятора
public class CalculableFactory implements ICalculableFactory {
    public ICalculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
