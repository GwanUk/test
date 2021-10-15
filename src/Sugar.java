public class Sugar implements Bread{

    public String breadType;
    public int flour;
    public int water;
    public int sugar;

    public Sugar(String breadType, int flour, int water, int sugar) {
        this.breadType = breadType;
        this.flour = flour;
        this.water = water;
        this.sugar = sugar;
    }

    @Override
    public String output() {
        return "breadType: " + breadType + "\n" +
                "recipe\n" +
                "flour: " + flour + "\n" +
                "water: " + water + "\n" +
                breadType + ": " + sugar + "\n\n";
    }
}
