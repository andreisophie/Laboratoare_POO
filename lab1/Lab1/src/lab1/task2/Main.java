package lab1.task2;

import lab1.task1.VeterinaryReport;
import lab1.task2.JobMarket;

public class Main {
    public static void main(String[] args) {

        JobMarket jm = new JobMarket();
        jm.main();

        Student Maria = new Student("Maria", 10);

        Student Viorica = new Student("Maria", 10);

        if (Maria.equals(Viorica))
            System.out.println("\nStudentele sunt la fel.");
        else
            System.out.println("\nStudentele sunt diferite.");
    }
}