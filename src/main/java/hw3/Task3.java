package hw3;

public class Task3<F, S> {

    /**
     * 3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
     * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из
     * составляющих пары, а также переопределение метода toString(), возвращающее строковое
     * представление пары. Работу сдать в виде ссылки на гит репозиторий.
     **/

    private F first;
    private S second;

    public Task3(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Task3{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
