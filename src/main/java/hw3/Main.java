package hw3;

public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task1" + "\n" + Task1.sum(123, 1.23) + "\n" +
                Task1.multiply(123, 1.23f) + "\n" +
                Task1.divide(123, 1.23) + "\n" +
                Task1.subtract(321, 123) + "\n");

        //Task2
        Integer[] array1 = {1, 2, 3};
        String[] array2 = {"One, two, tree"};
        Object[] array3 = {"One", 2, 3.0f};
        System.out.println("Task2" + "\n" + Task2.compareArrays(array1, array1) + "\n" +
                Task2.compareArrays(array2, array3) + "\n");

        //Task3
        Task3<Boolean, Float> pair = new Task3<>(true, 3.3f);
        System.out.println("Task3" + "\n" + pair.getFirst() + "\n" +
                pair.getSecond() + "\n" +
                pair.toString());
    }
}
