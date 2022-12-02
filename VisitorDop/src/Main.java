import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        VisitorSchool visitorSchool = new VisitorSchool();
        SchoolComponent school1 = new School("Школа №1", 4.6, 4);
        SchoolComponent school2 = new School("Школа №2", 3.9, 3.7);
        SchoolComponent school3 = new School("Школа №3", 4.2, 4.1);

        SchoolComponent school = new School("Объединенная школа", 3.1, 4.2);
        school.add(school1); school.add(school2); school.add(school3);

        school1.add(new Student("Иван", "Иванов", LocalDate.of(2000, 9, 1), 'm', new int[]{5, 5, 4, 3, 4}));
        school1.add(new Student("Денис", "Петров", LocalDate.of(2000, 10, 19), 'm', new int[]{4, 4, 4, 4, 4}));
        school1.add(new Student("Михаил", "Белый", LocalDate.of(2001, 3, 5), 'm', new int[]{5, 5, 4, 5, 5}));

        school2.add(new Student("Лилия", "Гараева", LocalDate.of(2002, 9, 15), 'w', new int[]{3, 3, 4, 3, 4}));
        school2.add(new Student("Мария", "Новая", LocalDate.of(2001, 12, 20), 'w', new int[]{5, 5, 5, 5, 5}));

        school3.add(new Student("Лилия", "Мариева", LocalDate.of(2002, 10, 1), 'w', new int[]{4, 4, 4, 4, 4}));
        SchoolComponent school4 = new School("Школа №4", 4.7, 4.4);
        school4.add(new Student("Вера", "Конькова", LocalDate.of(2000, 3, 17), 'w', new int[]{4, 5, 4, 5, 4}));
        school4.add(new Student("Дмитрий", "Гуливер", LocalDate.of(2000, 8, 21), 'm', new int[]{3, 3, 3, 5, 5}));
        school3.add(school4);
        school3.add(new Student("Маркус", "Вернес", LocalDate.of(2000, 7, 7), 'm', new int[]{4, 4, 3, 5, 5}));



        UnitedSchool unitedSchool = new UnitedSchool(school);
        unitedSchool.printMenu();
        System.out.println();
        unitedSchool.allSchools.accept(visitorSchool);

    }
}
