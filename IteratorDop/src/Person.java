import java.time.LocalDate;

public class Person {
    private String surname;
    private String name;
    private LocalDate date;
    private char gender;

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

    public Person(){
        setName("_");
        setSurname("_");
        setDate(LocalDate.of(1, 1, 1));
        setGender('n');} //n - none

    public Person(String nam, String surnam, LocalDate date, char gendr){
        setName(nam);
        setSurname(surnam);
        setDate(date);
        setGender(gendr);}




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

