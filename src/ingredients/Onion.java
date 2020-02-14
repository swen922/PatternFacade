package ingredients;

public class Onion implements Ingredient {

    public final static String name = "ONION";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
