import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;

public class SchoolN3 implements School{
    private int MAX_ITEMS = 10;
    int numberOfItems = 0;
    private Student[] students;

    public SchoolN3() {
        students = new Student[MAX_ITEMS];
    }

    @Override
    public Iterator<Student> createIterator() {
        return new ArrayIterator<>(students);
    }

    public void addStudent(String name, String surname, LocalDate date, char gender, int[] marks){
        Student student = new Student(name, surname, date, gender, marks);
        if (numberOfItems >= MAX_ITEMS) {
            MAX_ITEMS += 10;
            students = Arrays.copyOf(students, students.length + 10);}
        else {
            students[numberOfItems] = student;
            numberOfItems = numberOfItems + 1;}
    }
}
