package ss5.Student;

public class Student {
    private String names;
    private  String classed;

    public Student(String names, String classed) {
        this.names = names;
        this.classed = classed;
    }
    public Student() {

    }
    public void setNames(String names) {
        this.names = names;
    }
    public void setClassed(String classed) {
        this.classed = classed;
    }

    public String getNames() {
        return names;
    }
    @Override
    public String toString() {
        return "Student{" +
                "names='" + names + '\'' +
                ", classed='" + classed + '\'' +
                '}';
    }
    public String getClassed() {
        return classed;
    }
}
