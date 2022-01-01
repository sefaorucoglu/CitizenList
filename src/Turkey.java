public class Turkey extends Country {
    public int numberOfCitizen;
    public int numberOfSoldier;

    @Override
    public boolean firstRule() {
        return true;
    }

    @Override
    public int determineNumberOfSoldier(int numberOfCitizen) {
        return numberOfSoldier=(numberOfCitizen);
    }
}

