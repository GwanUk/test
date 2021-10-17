public class Butter implements Bread{

    public String breadType;
    public int flour;
    public int water;
    public int butter;

    public Butter(String breadType, int flour, int water, int butter) {
        this.breadType = breadType;
        this.flour = flour;
        this.water = water;
        this.butter = butter;
    }

    @Override
    public String output() {
        return "breadType: " + breadType + "\n" +
                "recipe\n" +
                "flour: " + flour + "\n" +
                "water: " + water + "\n" +
                breadType + ": " + butter + "\n\n";
    }

}
