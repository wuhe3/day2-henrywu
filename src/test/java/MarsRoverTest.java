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


    @Test
    public void should_face_west_when_orient_north_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('L');
        String report = rover.printReport();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        String report = rover.printReport();

        // Then
        assertEquals("0:0:E", report);
    }


}
