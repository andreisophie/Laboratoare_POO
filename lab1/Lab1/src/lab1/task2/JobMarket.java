package lab1.task2;

import java.util.ArrayList;
import lab1.task2.Student;
import lab1.task2.Internship;

public class JobMarket {

    public void main() {

        Student Gigel = new Student("Gigel", 7);

        Student Dorel = new Student("Dorel", 7);

        Student Marcel = new Student("Marcel", 9);

        Student Ionel = new Student("Ionel", 2);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(Gigel); studentList.add(Dorel);
        studentList.add(Marcel); studentList.add(Ionel);

        Internship Google = new Internship("Google", "5", studentList);

        Internship Amazon = new Internship("Amazon", "5", studentList);

        Internship Facebook = new Internship("Facebook", "9", studentList);

        Internship Microsoft = new Internship("Microsoft", "1", studentList);

        Google.chooseCandidatesForInterview();
        Amazon.chooseCandidatesForInterview();
        Facebook.chooseCandidatesForInterview();
        Microsoft.chooseCandidatesForInterview();

        /* Test pentru functia random */
        System.out.println("");
        Google.chooseCandidateRandomly();
    }
}
