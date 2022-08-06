package Student;

public class Student {

    private int id;
    private String faculty;
    private String surname;
    private String name;
    private double averageScore;

    public Student() {
    }

    public Student(int id, String faculty, String surname, String name, double averageScore) {
        this.id = id;
        this.faculty = faculty;
        this.surname = surname;
        this.name = name;
        this.averageScore = averageScore;
    }

    public Student(String faculty, String surname, String name, double averageScore) {
        this.faculty = faculty;
        this.surname = surname;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }
}
