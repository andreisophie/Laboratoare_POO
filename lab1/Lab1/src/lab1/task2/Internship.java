package lab1.task2;

import java.util.ArrayList;
import java.util.Random;

public class Internship {

    private String name;

    private String minGrade;

    private ArrayList<Student> students = new ArrayList<Student>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Internship(String name, String minGrade, ArrayList<Student> students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    public Student chooseCandidateRandomly() {

        int rnd = new Random().nextInt(students.size());
        System.out.println("Candidate " + students.get(rnd).getName() + " got a phone interview at " + getName());
        return students.get(rnd);
    }

    public void chooseCandidatesForInterview() {

        for (int i = 0; i < students.size(); i++)
            if (students.get(i).getGrade() >= Integer.parseInt(minGrade))
                System.out.println("Candidate " + students.get(i).getName() + " got a phone interview at " + getName());
    }
}
