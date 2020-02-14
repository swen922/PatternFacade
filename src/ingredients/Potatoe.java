package ingredients;

public class Potatoe implements Ingredient {

    public final static String name = "POTATOE";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return false;
    }
}
