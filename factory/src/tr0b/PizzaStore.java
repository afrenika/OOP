package tr0b;

public class PizzaStore {

    Pizza orderPizza(String type) throws Exception {
        Pizza pizza;
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("greek")) {
//            pizza = new GreekPizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        }
//        else throw new Exception("wrong type");

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;}




    }
