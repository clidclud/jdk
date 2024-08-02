package sem.projectManagement_ProjectBuilder6;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

public class Main {
    public static void main(String[] args) {
        double [] array = {1,2,3,4,5,6,7,8,9};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics(array);
        System.out.println("Минимальное: " + descriptiveStatistics.getMin());
        System.out.println("Максимальное: " + descriptiveStatistics.getMax());
        System.out.println("Сумма всех элементов: " + descriptiveStatistics.getSum());
        System.out.println("Среднее арифметическое: " + descriptiveStatistics.getMean());
        System.out.println("======================================");
        System.out.println("Факториал: " + ArithmeticUtils.factorial(5));
        System.out.println("Наименьшее общее частное: " + ArithmeticUtils.lcm(15, 25));
        System.out.println("Наибольший общий делитель: " + ArithmeticUtils.gcd(10,30));
        System.out.println("Является ли число 16 степенью 2: " + ArithmeticUtils.isPowerOfTwo(16));

    }
}
