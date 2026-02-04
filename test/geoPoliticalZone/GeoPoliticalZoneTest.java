package geoPoliticalZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {

    @Test
    public void testThatFCTIsInNorthCentralZone(){
        assertEquals(GeoPoliticalZone.North_Central, Service.getZone("fct"));
    }

    @Test
    public void testThatBauchiIsInNorthEastZone(){
        assertEquals(GeoPoliticalZone.North_East, Service.getZone("Bauchi"));
    }

    @Test
    public void testThatKanoIsInNorthWest(){
        assertEquals(GeoPoliticalZone.North_West, Service.getZone("kaNo"));
    }

    @Test
    public void testThatAbiaIsInSouthEast(){
        assertEquals(GeoPoliticalZone.South_East, Service.getZone("ABIA"));
    }

    @Test
    public void testThatDeltaIsInSouthSouth(){
        assertEquals(GeoPoliticalZone.South_South, Service.getZone("Delta"));
    }

    @Test
    public void testThatLagosIsInSouthWest(){
        assertEquals(GeoPoliticalZone.South_West, Service.getZone("Lagos"));
    }

    @Test
    public void testForInvalidState(){
        assertEquals(null, Service.getZone("Nigeria"));
    }
}