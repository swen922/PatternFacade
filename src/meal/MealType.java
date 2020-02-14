package meal;

public enum MealType {
    FRIED_POTATOE (true),
    SOUP_PEAS (false),
    BORZSCH (false),
    FRIED_MEAT (true),
    OMELET (true);

    private boolean isFried;

    MealType(boolean isFried) {
        this.isFried = isFried;
    }

    public boolean isFried() {
        return isFried;
    }
}
