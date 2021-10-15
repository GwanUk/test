public class Cream implements Bread{

    public String breadType;
    public int flour;
    public int water;
    public int cream;

    public Cream(String breadType, int flour, int water, int cream) {
        this.breadType = breadType;
        this.flour = flour;
        this.water = water;
        this.cream = cream;
    }

    @Override
    public String output() {
        return "breadType: " + breadType + "\n" +
                "recipe\n" +
                "flour: " + flour + "\n" +
                "water: " + water + "\n" +
                breadType + ": " + cream + "\n\n";
    }
}
