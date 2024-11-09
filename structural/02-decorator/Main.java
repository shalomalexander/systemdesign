import BasePizzas.BasePizza;
import BasePizzas.VegDelight;
import Toppings.CheeseTopping;
import Toppings.OliveTopping;

public class Main {
    public static void main(String[] args) {
        // 1. Create a veg base pizza and print its cost
        BasePizza pizza = new VegDelight();
        System.out.println("The cost of the base pizza is: " + pizza.cost());

        // 2. Add extra cheese to the base pizza and print cost.
        BasePizza extraChessPizza = new CheeseTopping(pizza);
        System.out.println("The cost of the extra cheese base pizza is: " + extraChessPizza.cost());

        // 3. Add extra olives to the base pizza and print cost.
        BasePizza extraOlivePizza = new OliveTopping(pizza);
        System.out.println("The cost of the extra olive base pizza is: " + extraOlivePizza.cost());


        // 4. Add extra chess, extra olives to the base pizza and print cost.
        BasePizza extraCheeseExtraOlivePizza = new CheeseTopping(new OliveTopping(pizza));
        System.out.println("The cost of the extra cheese + extra olive +  base pizza is: " + extraCheeseExtraOlivePizza.cost());
    }
}
