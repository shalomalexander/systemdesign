package Toppings;

import BasePizzas.BasePizza;

public class OliveTopping extends Toppings{
    BasePizza basePizza;

    public OliveTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return this.basePizza.cost() + 20;
    }

}
