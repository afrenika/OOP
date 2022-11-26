package tr1b;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) throws Exception {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        else throw  new Exception("wrong type");
        return pizza;
    }
}
