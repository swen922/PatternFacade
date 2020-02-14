package ingredients;

public class Milk implements Ingredient {

    public final static String name = "MILK";

    @Override
    public boolean isLiquid() {
        return true;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
