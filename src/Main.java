public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 6");
        //Задание 1.1
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла" + i);}

        //Задание 1.2
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла" + i);}

        // Задание 1.3
        for (int i = 0; i < 17; i+=2) {
            System.out.println("Итерация цикла" + i);}

        // Задание 1.4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла" + i);}

        // Задание 2.1

        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(+i+ " является високосным годом");}

        // Задание 2.2

        for (int i = 7; i <= 98; i=i+7) {
            System.out.println("Итерация цикла " + i);}

        // Задание 2.3

        for (int i = 1; i <= 512; i=i*2) {
            System.out.println("Итерация цикла " + i);}

        // Задание 3.1

        { int salary = 29000;
        int annualSalary = 0; //годовая зарплата
        for (int i = 1; i <= 12; i++) {
            annualSalary = annualSalary + salary;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+annualSalary+" рублей" );
        }}

        // Задание 3.2

        int salary = 29000;
        int annualSalary = 0; //годовая зарплата
        for (int i = 1; i <= 12; i++) {
            annualSalary = annualSalary + salary;
            annualSalary = annualSalary + annualSalary/100;
            System.out.println("Месяц "+i+" , сумма накоплений равна "+annualSalary+" рублей" );}











    }
}