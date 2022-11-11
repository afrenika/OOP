
import java.time.LocalDate;

public class Student extends Person implements Comparable<Student> {
    private int[] marks ;

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] mark) {
        this.marks = mark;
    }

    public Student() {
        super();
        setMarks(new int[0]);}

    public Student(String name, String surname, LocalDate date, char gender, int [] marks) {
        super(name, surname, date, gender);
        setMarks(marks);}

    public Student(String name, String surname, LocalDate date, char gender) {
        super(name, surname, date, gender);
        marks = new int[0];}

    public double getAverageMark(){
        double avM = 0;
        for(int mark: marks){avM += mark;}
        return Math.round((avM / marks.length) * 100) / 100.0;}

    public String about(){
        return getSurname() + " " + getName() + " " + getAge() + " лет(года)." + " Средняя оценка: " + getAverageMark();
    }


    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getAge(), this.getAge());
    }
}

