package tableware;

import ingredients.Ingredient;
import meal.Meal;
import meal.MealType;

import java.util.ArrayList;
import java.util.List;

public class Pot implements TableWare {

    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public boolean canFry() {
        return false;
    }

    @Override
    public boolean canBoil() {
        return true;
    }

    @Override
    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
    }

    @Override
    public Meal cook(MealType mealType) {
        if (!mealType.isFried()) {
            return new Meal(mealType);
        }
        return null;
    }
}
