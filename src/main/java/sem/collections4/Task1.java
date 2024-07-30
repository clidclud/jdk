package sem.collections4;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Иван", "Александр", "Игорь", "Егор"));
        System.out.println(names);
        sortByAlphabet(names);
        System.out.println(names);
        sortBuLength(names);
        System.out.println(names);
        reversList(names);
        System.out.println(names);
    }

    public static List<String> sortByAlphabet(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static void sortBuLength(List<String> list){
        list.sort(Comparator.comparing(String::length));
    }

    public static void reversList(List<String> list){
        Collections.reverse(list);
    }
}
