package geoPoliticalZone;

import java.util.Scanner;

public class GeoPoliticalZone {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a State");
        String state = input.nextLine();

        System.out.println(getZone(state));
    }

    public GeoPoliticalZone(){

    }

    public static String[] northCentralStates(){
        String[] states = {"benue", "fct", "kogi", "kwara","nasarawa", "niger", "plateau"};
        return states;
    }

    public static String[] northEastStates(){
        String[] states = {"adamawa", "bauchi", "borno", "gombe","taraba", "yobe"};
        return states;
    }

    public static String[] northWestStates(){
        String[] states = {"kaduna", "katsina", "kano", "kebbi","sokoto", "jigawa", "zamfara"};
        return states;
    }

    public static String[] southEastStates(){
        String[] states = {"abia","anambra","ebonyi","enugu","imo"};
        return states;
    }

    public static String[] southSouthStates(){
        String[] states = {"akwa-ibom", "bayelsa", "cross-river", "delta","edo", "rivers"};
        return states;
    }

    public static String[] southWestStates(){
        String[] states = {"ekiti","lagos","osun","ondo","ogun", "oyo"};
        return states;
    }

    public static boolean isInZone(String[] states, String state) {

        for (String area : states) {
            if (area.equalsIgnoreCase(state)) {
                return true;
            }
        }
        return false;
    }

    public static String getZone(String state) {
        state = state.toLowerCase();

        if (isInZone(northCentralStates(), state))
            return "North Central";
        else if (isInZone(northEastStates(), state))
            return "North East";
        else if (isInZone(northWestStates(), state))
            return "North West";
        else if (isInZone(southEastStates(), state))
            return "South East";
        else if (isInZone(southSouthStates(), state))
            return "South South";
        else if (isInZone(southWestStates(), state))
            return "South West";
        else
            return "Invalid state";
    }


}
