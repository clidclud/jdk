package hw3;

public class Task1 {

    /**
     * 1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
     * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
     * над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
     **/

    public static <F extends Number, S extends Number> double sum(F f, S s) {
        return f.doubleValue() + s.doubleValue();
    }

    public static <F extends Number, S extends Number> double multiply(F f, S s) {
        return f.doubleValue() * s.doubleValue();
    }

    public static <F extends Number, S extends Number> double divide(F f, S s) {
        if (f.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return f.doubleValue() / s.doubleValue();
    }

    public static <F extends Number, S extends Number> double subtract(F f, S s) {
        return f.doubleValue() - s.doubleValue();
    }
}
