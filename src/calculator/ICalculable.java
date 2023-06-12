package calculator;
// Интерфейс основных методов для калькулятора
public interface ICalculable {
    ICalculable sum(int arg);
    ICalculable multi(int arg);
    int getResult();
}
