import java.util.ArrayList;
import java.util.List;

public class School extends SchoolComponent{
    List<SchoolComponent> schoolComponents = new ArrayList<SchoolComponent>();
    String name;

    public School(String name) {
        this.name = name;

    }
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
}
