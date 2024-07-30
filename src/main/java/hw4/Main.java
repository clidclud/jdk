package hw4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Создать справочник сотрудников
        //Необходимо:
        //Создать класс справочник сотрудников, который содержит внутри
        //коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
        //Табельный номер
        //Номер телефона
        //Имя
        //Стаж
        EmployeeDirectory employeeDirectory = new EmployeeDirectory(new ArrayList<>());
        Employee employee = new Employee(1, 123, "Bob", 1);
        Employee employee1 = new Employee(2, 456, "Rob", 2);
        Employee employee2 = new Employee(3, 789, "Tom", 3);

        //Добавить метод добавления нового сотрудника в справочник
        employeeDirectory.addEmployee(employee);
        employeeDirectory.addEmployee(employee1);
        employeeDirectory.addEmployee(employee2);

        //Добавить метод, который ищет сотрудника по стажу (может быть список)
        System.out.println(employeeDirectory.searchByExperience(1));

        //Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
        System.out.println(employeeDirectory.thePhoneNumberOfTheEmployeeByName("Rob"));

        //Добавить метод, который ищет сотрудника по табельному номеру
        System.out.println(employeeDirectory.searchByServiceNumber(3));
    }
}

