abstract public class SchoolComponent {

    public void add(SchoolComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(SchoolComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public SchoolComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public abstract void accept(VisitorSchool visitorSchool);
}
