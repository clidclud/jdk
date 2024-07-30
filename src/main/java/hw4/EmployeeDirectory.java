package hw4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {

    private List<Employee> employeeList;

    public EmployeeDirectory(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public List<Employee> searchByExperience(int experience){
        List<Employee> result = new ArrayList<>();
            for(Employee employees : getEmployeeList()){
                if(employees.getExperience() == experience){
                    result.add(employees);
                }
            }
            return result;
    }

    public List<Integer> thePhoneNumberOfTheEmployeeByName(String name){
        List<Integer> result = new ArrayList<>();
        for (Employee employee : getEmployeeList()) {
            if (employee.getName().equals(name))
                result.add(employee.getPhoneNumber());
        }
        return result;
    }

    public List<Employee> searchByServiceNumber(int id){
        List<Employee> result = new ArrayList<>();
        for(Employee employee : getEmployeeList()){
            if (employee.getServiceNumber() == id){
                result.add(employee);
            }
        }
        return result;
    }
}