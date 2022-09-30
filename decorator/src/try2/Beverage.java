package try2;

public class Beverage {
    public String description = "coffee";

    boolean milk = false;
    boolean soy = false;
    boolean mocha = false;
    boolean whip = false;

    public String getDescription() {
        return description;
    }
    public double cost(){
        return ((hasMilk())?50:0)
                + ((hasSoy())?150:0)
                + ((hasMocha())?100:0)
                + ((hasWhip())?80:0);
    }

    public boolean hasMilk(){
        return milk;}
    public void setMilk() {
        milk = true;
    }

    public boolean hasSoy(){
        return soy;}
    public void setSoy() {
        soy = true;
    }

    public boolean hasMocha(){
        return mocha;}
    public void setMocha() {
        mocha = true;
    }

    public boolean hasWhip(){
        return whip;}
    public void setWhip() {
        whip = true;
    }


}
