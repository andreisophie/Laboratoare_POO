import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/*
 *
 *  ¨¨¨¨¨¨¨¨¨¨*
 *  ¨¨¨¨¨¨¨¨¨**
 *  ¨¨¨¨¨¨¨¨¨*o*
 *  ¨¨¨¨¨¨¨¨*☺*o*
 *  ¨¨¨¨¨¨¨***o***
 *  ¨¨¨¨¨¨**o**☺*o*
 *  ¨¨¨¨¨**☺**o**o**
 *  ¨¨¨¨**o**☺***☺*o*                 ECHIPA OOP vă urează un Crăciun fericit,
 *  ¨¨¨*****☺*o**o****                      și un AN NOU fără restanțe!
 *  ¨¨**☺**o*****o**☺**
 *  ¨void*o*void*o*void*o*
 *  ****o***☺**o***o***☺*
 *  ¨¨¨¨¨____!_!____
 *  ¨¨¨¨¨\_________/¨¨
 *
 */


// Discuss with the teaching assistant why it was necessary to use a bounded type: < T extends Comparable<T>>
// Because we need to compare the values in the nodes to construct BST
class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> right;
    private Node<T> left;
    public Node(T value, Node<T> right, Node<T> left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getRight() {
        return right;
    }
    public void setRight(Node<T> right) {
        this.right = right;
    }
    public Node<T> getLeft() {
        return left;
    }
    public void setLeft(Node<T> left) {
        this.left = left;
    }    
}

interface Tree<T extends Comparable<T>> {

    void addValue(T value);

    void addAll(List<T> values);

    HashSet<T> getValues(T inf, T sup);

    int size();

    boolean isEmpty();
}

class TreeImpl<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;
    private int size;

    @Override
    public void addValue(T value) {
        Node<T> newNode = new Node<T>(value, null, null);
        size++;
        if (root == null) {
            root = newNode;
            return;
        }
        Node<T> parent = null;
        Node<T> current = root;
        while (current != null) {
            if (current.getValue().compareTo(newNode.getValue()) < 0) {
                parent = current;
                current = current.getRight();
            } else {
                parent = current;
                current = current.getLeft();
            }
        }
        if (parent.getValue().compareTo(newNode.getValue()) < 0) {
            parent.setRight(newNode);
        } else {
            parent.setLeft(newNode);
        }

    }

    @Override
    public void addAll(List<T> values) {
        for (T value : values) {
            addValue(value);
        }
    }

    @Override
    public HashSet<T> getValues(T inf, T sup) {
        HashSet<T> newSet = new HashSet<>();
        addRecursive(newSet, root, inf, sup);
        return newSet;
    }

    private void addRecursive(HashSet<T> set, Node<T> current, T inf, T sup) {
        if (current == null) {
            return;
        }

        addRecursive(set, current.getLeft(), inf, sup);

        if (current.getValue().compareTo(inf) >= 0 && current.getValue().compareTo(sup) <= 0) {
            set.add(current.getValue());
        }

        addRecursive(set, current.getRight(), inf, sup);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

class Student implements Comparable<Student> {
    private final Float grade;

    public Student(Float grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        return this.grade.compareTo(student.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}

public class Main {

    private static Integer testNr = 0;

    public static void main(String[] args) {

        final Tree<Student> tree = new TreeImpl<>();
        final List<Student> studentList = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            studentList.add(createGenericStudent((float) i));
        }

        printTestNr(); // 1
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 2
        for (int i = 0; i < 5; i++) {
            tree.addValue(createGenericStudent((float) i));
        }
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 3
        tree.addAll(studentList);
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 4
        final Student studentThatPassedExam = new Student(5.0f);
        final Student studentThatWorkedHardToPassTheExam = new Student(10.0f);
        final HashSet<Student> values = tree.getValues(studentThatPassedExam, studentThatWorkedHardToPassTheExam);
        System.out.println(values.size());
        values.stream().sorted().forEach(System.out::println);
    }

    private static void printTestNr() {
        System.out.println("TEST " + ++testNr + " result:");
    }

    private static Student createGenericStudent(final Float grade) {
        return new Student(grade);
    }
}