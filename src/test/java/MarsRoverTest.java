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
    public void should_face_north_when_orient_east_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('L');

        // Then
        assertEquals("0:0:N", rover.printReport());
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('L');

        // Then
        assertEquals("0:0:E", rover.printReport());
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('L');

        // Then
        assertEquals("0:0:S", rover.printReport());
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

    @Test
    public void should_face_south_when_orient_east_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('R');
        String report = rover.printReport();

        // Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('R');
        String report = rover.printReport();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('R');
        String report = rover.printReport();

        // Then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_return_0_1_N_when_move_forward_given_0_0_N() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('M');

        // Then
        assertEquals("0:1:N", rover.printReport());

    }

    @Test
    public void should_return_minus_1_0_W_when_move_forward_given_0_0_E() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('L');
        rover.executeCommand('M');

        // Then
        assertEquals("-1:0:W", rover.printReport());
    }

    @Test
    public void should_return_0_minus_1_S_when_move_forward_given_0_0_S() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('M');

        // Then
        assertEquals("0:-1:S", rover.printReport());
    }

    @Test
    public void should_return_1_0_E_when_move_forward_given_0_0_W() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommand('R');
        rover.executeCommand('R');
        rover.executeCommand('M');

        // Then
        assertEquals("1:0:E", rover.printReport());
    }

}
