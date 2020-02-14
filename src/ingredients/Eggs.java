package ingredients;

public class Eggs implements Ingredient {

    public final static String name = "EGGS";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
