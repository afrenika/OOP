import java.time.LocalDate;
import java.util.Iterator;

public class SchoolN1 implements School{
    private final DynamicArray<Student> students;

    public SchoolN1() {
        students = new DynamicArray<>();
    }

    @Override
    public Iterator<Student> createIterator() {
        return students.iterator();
    }

    public void addStudent(String name, String surname, LocalDate date, char gender, int[] maks){
        Student student = new Student(name, surname, date, gender, maks);
        students.add(student);
    }
}
