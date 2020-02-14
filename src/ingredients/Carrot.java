package ingredients;

public class Carrot implements Ingredient {

    public final static String name = "CARROT";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
