public class Student {
    private int studentId;
    private String name;
    private int age;
    private String course;
    private int percentage;

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getPercentage() {
        return percentage;
    }

    public Student(int studentId, String name, int age, String course, int percentage) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.percentage = percentage;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", course=" + course
                + ", percentage=" + percentage + "]";
    }
}