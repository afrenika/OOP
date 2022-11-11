
import java.time.LocalDate;

public class Student extends SchoolComponent implements Comparable<Student> {
    private String surname;
    private String name;
    private LocalDate date;
    private char gender;
    private int[] marks ;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'ж' || gender == 'м' || gender == 'w' || gender == 'm'){
            this.gender = gender;}
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] mark) {
        this.marks = mark;
    }

    public Student() {
        setName("_");
        setSurname("_");
        setDate(LocalDate.of(1, 1, 1));
        setGender('n'); //n - none
        setMarks(new int[0]);}

    public Student(String name, String surname, LocalDate date, char gender, int [] marks) {
        setName(name);
        setSurname(surname);
        setDate(date);
        setGender(gender);
        setMarks(marks);}

    public Student(String name, String surname, LocalDate date, char gender) {
        setName(name);
        setSurname(surname);
        setDate(date);
        setGender(gender);
        marks = new int[0];}

    public double getAverageMark(){
        double avM = 0;
        for(int mark: marks){avM += mark;}
        return Math.round((avM / marks.length) * 100) / 100.0;}

    @Override
    public void print(){
        System.out.println(getSurname() + " " + getName() + " " + getAge() + " лет(года)." + " Средняя оценка: " + getAverageMark());
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getAge(), this.getAge());
    }

    public int getAge(){
        int ag = 0;
        LocalDate mw = LocalDate.now();
        if (mw.getMonthValue() > getDate().getMonthValue()) {
            ag = mw.getYear() - getDate().getYear();}

        else if (mw.getMonthValue() < getDate().getMonthValue()) {
            ag = mw.getYear() - getDate().getYear() - 1;}

        else if (mw.getMonthValue() == getDate().getMonthValue()) {
            if (mw.getDayOfMonth() >= getDate().getDayOfMonth()) {
                ag = mw.getYear() - getDate().getYear();}
            else {ag = mw.getYear() - getDate().getYear() - 1;}}
        return ag;}


}

