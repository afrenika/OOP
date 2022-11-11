import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnitedSchool {
    List<School> schools;

    public UnitedSchool(List<School> schools) {
        this.schools = schools;
    }

    public UnitedSchool() {
        schools = new ArrayList<>();
    }

    public void addSchool(School school){
        schools.add(school);
    }

    public void printStudents(){
        System.out.println("Список студентов:");
        for(School school:schools){
            printStudents(school.createIterator());
        }
    }
    private void printStudents(Iterator<Student> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next().about());
        }
    }


}
