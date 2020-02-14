package ingredients;

public class Butter implements Ingredient {

    public final static String name = "BUTTER";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
