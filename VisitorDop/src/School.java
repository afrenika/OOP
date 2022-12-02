import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class School extends SchoolComponent{
    private List<SchoolComponent> schoolComponents = new ArrayList<>();
    private String name;
    private double averageExamsBall;
    private double averageReviewBall;
    private int countReview = 10;

    public School(String name, double averageExamsBall, double averageReviewBall) {
        this.name = name;
        this.averageExamsBall = averageExamsBall;
        this.averageReviewBall = averageReviewBall;}

    public void add(SchoolComponent menuComponent) {
        schoolComponents.add(menuComponent);
    }
    public void remove(SchoolComponent menuComponent) {
        schoolComponents.remove(menuComponent);
    }
    public SchoolComponent getChild(int i) {
        return schoolComponents.get(i);
    }
    public String getName() {
        return name;
    }


    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("---------------------");
        for (SchoolComponent schoolComponent : schoolComponents) {
            schoolComponent.print();
        }
        System.out.println();
    }

    public List<SchoolComponent> getSchoolComponents() {
        return schoolComponents;
    }

    public double getAverageExamsBall() {
        return averageExamsBall;
    }

    public double getAverageReviewBall() {
        return averageReviewBall;
    }

    public void addReview(int review){
        averageReviewBall = (averageReviewBall*countReview + review)/countReview++;
    }

    public void addReview(Collection<Integer> review){
        averageReviewBall = averageReviewBall*countReview;
        for(Integer item:review){
            averageReviewBall+= item;
            countReview++;}
        averageReviewBall/=countReview;
    }

    public void accept(VisitorSchool visitorSchool){
        visitorSchool.accept(this);
    }




}
