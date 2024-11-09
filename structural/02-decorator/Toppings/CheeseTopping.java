package Toppings;

import BasePizzas.BasePizza;

public class CheeseTopping extends Toppings{
    BasePizza basePizza;

    public CheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return this.basePizza.cost() + 50;
    }

}
