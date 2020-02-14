package ingredients;

public class Rice implements Ingredient {

    public final static String name = "RICE";

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return false;
    }
}
