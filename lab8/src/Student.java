public class Student implements Comparable<Student> {
    /* ------------------------- Task 1 ------------------------- */
    /* Add student properties */
    /* Generate getters and setters */
    private String name;
    private String surname;
    private long id;
    private double averageGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student(String name, String surname, long id, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    /* Override `compareTo` and `toString` methods */

    @Override
    public int compareTo(Student s) {
        if (this.averageGrade != s.averageGrade) {
            if (this.averageGrade > s.averageGrade) {
                return 1;
            }
            return -1;
        }
        if (!this.surname.equals(s.surname)) {
            return this.surname.compareTo(s.surname);
        }
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', surname='" + surname + "', id=" + id + ", averageGrade=" + averageGrade + "}";
    }

    /* ------------------------- Task 5 ------------------------- */
    /* Override `equals` and `hashCode` methods */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        long temp;
        temp = Double.doubleToLongBits(averageGrade);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(averageGrade) != Double.doubleToLongBits(other.averageGrade))
            return false;
        return true;
    }
}
