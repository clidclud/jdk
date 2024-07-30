package sem.collections4;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("123456789", "Иван");
        phonebook.put("234567891", "Сергей");
        phonebook.put("345678912", "Станислав");
        phonebook.put("456789123", "Святослав");

        System.out.println(findMinPhoneNumber(phonebook));
        System.out.println(findByMaxAlphabetName(phonebook));
    }

    public static String findMinPhoneNumber(Map<String, String> phonebook) {
        Set<Long> numbers = phonebook.keySet().stream().map(el -> Long.valueOf(el)).collect(Collectors.toSet());
        long number = numbers.stream().min(Comparator.naturalOrder()).get();
        return String.format("Наименьший номер: %s, владелец: %s",
                String.valueOf(number), phonebook.get(String.valueOf(number)));
    }

    public static String findByMaxAlphabetName(Map<String, String> phonebook){
        Set<Map.Entry<String, String>> elements = phonebook.entrySet();
        Map.Entry <String, String> name = elements.stream().max((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).get();
        return String.format("Наибольшее имя в алфавитном порядке: %s, номер телефона %s", name.getValue(), name.getKey());
    }
}