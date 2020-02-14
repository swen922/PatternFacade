package tableware;

import ingredients.Ingredient;
import meal.Meal;
import meal.MealType;

public interface TableWare {
    public boolean canFry();
    public boolean canBoil();
    public void addIngredient(Ingredient i);
    public Meal cook(MealType mealType);
}
