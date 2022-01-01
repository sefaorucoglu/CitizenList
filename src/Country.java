public abstract class Country implements Nato {
    private String name;
    private int numberOfSoldier;
    private int numberOfCitizen;
    public abstract boolean firstRule();
    public abstract int determineNumberOfSoldier(int numberOfCitizen);
}
