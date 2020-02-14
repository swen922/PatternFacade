package meal;

public class Meal {

    private MealType mealType;

    public Meal(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public String toString() {
        return "It's very tasty Meal – " + mealType;
    }
}
