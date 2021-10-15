public class BreadFactory {

    public Bread getBread(String breadType) {
        if (breadType.equals("cream")) {
            return new Cream("cream", 100, 100, 200);
        } else if (breadType.equals("sugar")) {
            return new Sugar("sugar", 100, 50, 200);
        } else if (breadType.equals("butter")) {
            return new Butter("butter", 100, 100, 50);
        }
        return null;
    }
}
