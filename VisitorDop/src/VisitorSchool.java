public class VisitorSchool {
    void accept(School school) {
        System.out.println("Статистика школы " + school.getName() +":");
        System.out.println("Средний балл на экзамене: " + school.getAverageExamsBall());
        System.out.println("Средний рейтинг по отзывам: " + school.getAverageReviewBall());
        _accept(school);
    }

    void accept(Student student){
        System.out.println("Статистика студента:");
        student.print();
         }

    void _accept(School school){
        for(SchoolComponent item:school.getSchoolComponents()){
            if(item instanceof School sc){accept(sc);
                System.out.println();}
            else {accept((Student) item);}
        }

    }


}
