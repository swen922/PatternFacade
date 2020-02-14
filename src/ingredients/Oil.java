package ingredients;

public class Oil implements Ingredient {

    public final static String name = "OIL";

    @Override
    public boolean isLiquid() {
        return true;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
