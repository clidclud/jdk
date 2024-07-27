package hw2;

public class Main {

    public static <S, F> String generalizedMethod(Generalized<S,F> generalized){
        return generalized.first().toString() + generalized.second().toString();

    }
    public static void main(String[] args) {
        Generalized<Integer, Integer> integerGeneralized = new Generalized<>(1, 2);
        System.out.println(generalizedMethod(integerGeneralized));

        Generalized<String, String> stringGeneralized = new Generalized<>("Text", "Text");
        System.out.println(generalizedMethod(stringGeneralized));

        Generalized<String, Integer> stringIntegerGeneralized = new Generalized<>("Text", 1);
        System.out.println(generalizedMethod(stringIntegerGeneralized));
    }
}
