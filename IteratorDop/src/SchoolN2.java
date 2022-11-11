import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class SchoolN2 implements School{
    private final ArrayList<Student> students;

    public SchoolN2() {
        students = new ArrayList<>();
    }

    @Override
    public Iterator<Student> createIterator() {
        return students.iterator();
    }

    public void addStudent(String name, String surname, LocalDate date, char gender, int[] marks){
        Student student = new Student(name, surname, date, gender, marks);
        students.add(student);
    }
}
