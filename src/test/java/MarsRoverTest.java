import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MarsRoverTest {
    @Test
    public void should_initialize_mars_rover() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        String report = rover.printReport();

        // Then
        assertEquals("0:0:N", report);
    }


}
