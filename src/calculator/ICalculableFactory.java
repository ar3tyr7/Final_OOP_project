package calculator;
// Интерфейс для создания аргуменотов калькулятора 
public interface ICalculableFactory {
    ICalculable create(int primaryArg);
}
