package tr1b;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) throws Exception {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        else throw new Exception("wrong type");
        return pizza;
    }
}
