
import meal.Meal;
import meal.MealType;

/** Фасад, также известен как: Facade */


/*** THIS IS OUR CLIENT – HE WANT TO EAT SOMETHING */
public class App {
    public static void main(String[] args) {

        Facad facad = new Facad();

        Meal myMeal = facad.cook(MealType.BORZSCH);
        System.out.println(myMeal);

        Meal myMeal2 = facad.cook(MealType.FRIED_POTATOE);
        System.out.println(myMeal2);

        Meal myMeal3 = facad.cook(MealType.OMELET);
        System.out.println(myMeal3);

    }


}
