package ingredients;

public class Water implements Ingredient {

    public final static String name = "WATER";

    @Override
    public boolean isLiquid() {
        return true;
    }

    @Override
    public boolean canBeEatenRaw() {
        return true;
    }
}
