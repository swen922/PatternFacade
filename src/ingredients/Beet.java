package ingredients;

public class Beet implements Ingredient {

    public final static String name = "BEET";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
