package ingredients;

public class RawMeat implements Ingredient {

    public final static String name = "RAW_MEAT";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return false;
    }
}
