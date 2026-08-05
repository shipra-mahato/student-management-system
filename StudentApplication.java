import java.util.ArrayList;
import java.util.List;

public class StudentApplication {
    public static boolean isEligibleForPlacement(Student set) {
        return set.getPercentage() >= 60;

    }

    public static void main(String args[]) {
        Student hamlet = new Student(1, "Hamlet", 15, "IT", 61);
        Student odessey = new Student(2, "Odessey", 16, "CS", 60);
        Student hal = new Student(3, "Hal", 15, "AI", 70);

        System.out.println(hamlet);
        System.out.println(odessey);
        System.out.println(hal);

        List<Student> studentList = new ArrayList<>();
        studentList.add(hamlet);
        studentList.add(odessey);
        studentList.add(hal);
        studentList.forEach(student -> System.out.println(Boolean.toString(isEligibleForPlacement(student))));
    }
}
