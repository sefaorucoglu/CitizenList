public class Russia extends Country {
   public int numberOfCitizen;
    public int numberOfSoldier;
    public boolean firstRule() {
        return false;
    }


    public int determineNumberOfSoldier(int numberOfCitizen) {
        return numberOfSoldier=(numberOfCitizen/2);
    }
}
