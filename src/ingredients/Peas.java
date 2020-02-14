package ingredients;

public class Peas implements Ingredient {

    public final static String name = "PEAS";


    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public boolean canBeEatenRaw() {
        return false;
    }
}
