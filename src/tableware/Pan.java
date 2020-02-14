package tableware;

import ingredients.Ingredient;
import meal.Meal;
import meal.MealType;

import java.util.ArrayList;
import java.util.List;

public class Pan implements TableWare {

    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public boolean canFry() {
        return true;
    }

    @Override
    public boolean canBoil() {
        return false;
    }

    @Override
    public void addIngredient(Ingredient i) {
        this.ingredients.add(i);
    }

    @Override
    public Meal cook(MealType mealType) {
        if (mealType.isFried()) {

            return new Meal(mealType);
        }
        return null;
    }
}
