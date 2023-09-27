import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        Student student1 = new Student("Nurbakyt", 3.65);
        Student student2 = new Student("Berik", 3.5);
        Student student3 = new Student("Anzor", 3.45);
        Student student4 = new Student("Makhmud", 2.65);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Optional<Student> optional = func(list);

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }else {
            System.out.println(Optional.empty());
        }
    }

    public static Optional<Student> func(List<Student> list) {
        return list.stream().max(Comparator.comparing(Student::getGpa));

    }
}

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

