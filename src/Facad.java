import ingredients.*;
import meal.*;
import tableware.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** THIS IS OUR FACADE FOR SIMPLE USERS */

public class Facad {

    private TableWare tableWare;
    private List<TableWare> tableWares = new ArrayList<>();
    private Map<String, Ingredient> ingredients = new HashMap();

    public Facad() {
        buyIngredients();
        washDishes();
    }

    public Meal cook(MealType mealType) {

        if (mealType.isFried()) {
            tableWare = tableWares.get(0);
        }
        else {
            tableWare = tableWares.get(1);
        }

        switch (mealType) {
            case FRIED_MEAT:
                tableWare.addIngredient(ingredients.get(RawMeat.name));
                tableWare.addIngredient(ingredients.get(Oil.name));
                tableWare.addIngredient(ingredients.get(Onion.name));
                return tableWare.cook(mealType);
            case FRIED_POTATOE:
                tableWare.addIngredient(ingredients.get(Potatoe.name));
                tableWare.addIngredient(ingredients.get(Oil.name));
                return tableWare.cook(mealType);
            case OMELET:
                tableWare.addIngredient(ingredients.get(Eggs.name));
                tableWare.addIngredient(ingredients.get(Butter.name));
                tableWare.addIngredient(ingredients.get(Milk.name));
                return tableWare.cook(mealType);
            case SOUP_PEAS:
                tableWare.addIngredient(ingredients.get(Water.name));
                tableWare.addIngredient(ingredients.get(Onion.name));
                tableWare.addIngredient(ingredients.get(Carrot.name));
                tableWare.addIngredient(ingredients.get(Peas.name));
                return tableWare.cook(mealType);
            case BORZSCH:
                tableWare.addIngredient(ingredients.get(Water.name));
                tableWare.addIngredient(ingredients.get(Onion.name));
                tableWare.addIngredient(ingredients.get(Carrot.name));
                tableWare.addIngredient(ingredients.get(Beet.name));
                return tableWare.cook(mealType);

            default :
                return null;
        }
    }

    private void buyIngredients() {
        this.ingredients.put(Butter.name, new Butter());
        this.ingredients.put(Carrot.name, new Carrot());
        this.ingredients.put(Eggs.name, new Eggs());
        this.ingredients.put(Milk.name, new Milk());
        this.ingredients.put(Oil.name, new Oil());
        this.ingredients.put(Onion.name, new Onion());
        this.ingredients.put(Peas.name, new Peas());
        this.ingredients.put(Potatoe.name, new Potatoe());
        this.ingredients.put(RawMeat.name, new RawMeat());
        this.ingredients.put(Rice.name, new Rice());
        this.ingredients.put(Beet.name, new Beet());
        this.ingredients.put(Water.name, new Water());

    }

    private void washDishes() {
        tableWares.add(new Pan());
        tableWares.add(new Pot());
    }
}
