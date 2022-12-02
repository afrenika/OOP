public class UnitedSchool {
    SchoolComponent allSchools;
    public UnitedSchool(SchoolComponent allSchools) {
        this.allSchools = allSchools;
    }
    public void printMenu() {
        allSchools.print();}
}
