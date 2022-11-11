import java.time.LocalDate;

public class UnitedSchoolTest {
    public static void main(String[] args) {

        SchoolN1 school1 = new SchoolN1();


        school1.addStudent("Иван", "Иванов", LocalDate.of(2000, 9, 1), 'm', new int[]{5, 5, 4, 3, 4});
        school1.addStudent("Денис", "Петров", LocalDate.of(2000, 10, 19), 'm', new int[]{4, 4, 4, 4, 4});
        school1.addStudent("Михаил", "Белый", LocalDate.of(2001, 3, 5), 'm', new int[]{5, 5, 4, 5, 5});

        SchoolN2 school2 = new SchoolN2();
        school2.addStudent("Лилия", "Гараева", LocalDate.of(2002, 9, 15), 'w', new int[]{3, 3, 4, 3, 4});
        school2.addStudent("Мария", "Новая", LocalDate.of(2001, 12, 20), 'w', new int[]{5, 5, 5, 5, 5});

        SchoolN3 school3 = new SchoolN3();
        school3.addStudent("Лилия", "Мариева", LocalDate.of(2002, 10, 1), 'w', new int[]{4, 4, 4, 4, 4});
        school3.addStudent("Маркус", "Вернес", LocalDate.of(2000, 7, 7), 'm', new int[]{4, 4, 3, 5, 5});

        UnitedSchool unitedSchool = new UnitedSchool();
        unitedSchool.addSchool(school1);
        unitedSchool.addSchool(school2);
        unitedSchool.addSchool(school3);

        unitedSchool.printStudents();
    }
}
