package hw3;

public class Task2 {

    /**
     * 2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
     * если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
     * но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
     **/

    public static <F, S> boolean compareArrays(F[] f, S[] s) {
        if (f.getClass().equals(s.getClass())) {
            return  (f.length == s.length);
        }
        return false;
    }
}
