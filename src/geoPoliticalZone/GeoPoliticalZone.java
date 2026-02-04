package geoPoliticalZone;

public enum GeoPoliticalZone {
    North_Central ("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    North_East ("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    North_West ("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    South_East("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    South_South ("Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    South_West ("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");

    private final String[] states;

    GeoPoliticalZone(String... states){
        this.states = states;
    }

    public boolean hasState(String state){
        for(String area : states){
            if(area.equalsIgnoreCase(state)){
                return true;
            }
        }
        return false;
    }

}

