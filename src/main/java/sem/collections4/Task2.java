package sem.collections4;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Иван", "Александр", "Игорь", "Егор"));
        Set<String> setName = convertListToSet(names);
        System.out.println("Наименьшее по алфавиту: " + minLengthName(setName));
        List<String> minAndMaxNames = minAndMaxLengthName(setName);
        System.out.printf("Наименьшее по длине имя: %s, наибольшее по длине имя: %s\n",
                minAndMaxNames.get(0), minAndMaxNames.get(1));
        removeNamesByChar(setName,'А');
        System.out.println("Коллекция после удаления буквы А: " + setName);
    }

    public static Set<String> convertListToSet(List<String> list) {
        return new HashSet<>(list);
    }

    public static String minLengthName(Set<String> names) {
        return names.stream().min(Comparator.naturalOrder()).orElse(null);
    }

    public static List<String> minAndMaxLengthName(Set<String> names) {
    List<String> resultNames = new ArrayList<>();
    resultNames.add(names.stream().min(Comparator.comparing(String::length)).orElse(null));
    resultNames.add(names.stream().max(Comparator.comparing(String::length)).orElse(null));
    return resultNames;
    }

    public static void removeNamesByChar (Set<String> names, char symbol) {
        names.removeIf(name -> name.toLowerCase().contains(String.valueOf(symbol).toLowerCase()));
    }
}
