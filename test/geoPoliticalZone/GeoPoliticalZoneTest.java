package geoPoliticalZone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalZoneTest {

    @Test
    public void testThatLagosIsInSouthWest(){
        assertEquals("South West", GeoPoliticalZone.getZone("Lagos"));
    }

    @Test
    public void testThatFCTIsInNorthCentralZone(){

    }
}
