package geoPoliticalZone;

public class Service {
    public static GeoPoliticalZone getZone(String state) {

        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            if (zone.hasState(state)) {
                return zone;
            }
        }
        return null;
    }
}
