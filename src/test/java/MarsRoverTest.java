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
        rover.executeCommands("L");
        String report = rover.printReport();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_north_when_orient_east_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RL");

        // Then
        assertEquals("0:0:N", rover.printReport());
    }

    @Test
    public void should_face_east_when_orient_south_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RRL");

        // Then
        assertEquals("0:0:E", rover.printReport());
    }

    @Test
    public void should_face_south_when_orient_west_and_turn_left() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RRRL");

        // Then
        assertEquals("0:0:S", rover.printReport());
    }

    @Test
    public void should_face_east_when_orient_north_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("R");
        String report = rover.printReport();

        // Then
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_face_south_when_orient_east_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RR");
        String report = rover.printReport();

        // Then
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_face_west_when_orient_south_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RRR");
        String report = rover.printReport();

        // Then
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_face_north_when_orient_west_and_turn_right() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RRRR");
        String report = rover.printReport();

        // Then
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_return_0_1_N_when_move_forward_given_0_0_N() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("M");

        // Then
        assertEquals("0:1:N", rover.printReport());
    }

    @Test
    public void should_return_minus_1_0_W_when_move_forward_given_0_0_E() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("LM");

        // Then
        assertEquals("-1:0:W", rover.printReport());
    }

    @Test
    public void should_return_0_minus_1_S_when_move_forward_given_0_0_S() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RRM");

        // Then
        assertEquals("0:-1:S", rover.printReport());
    }

    @Test
    public void should_return_minus_1_0_W_when_move_forward_given_0_0_W() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("LM");

        // Then
        assertEquals("-1:0:W", rover.printReport());
    }

    @Test
    public void should_return_0_minus_1_N_when_move_back_given_0_0_N() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("B");

        // Then
        assertEquals("0:-1:N", rover.printReport());
    }

    @Test
    public void should_return_minus_1_0_E_when_move_back_given_0_0_E() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RB");

        // Then
        assertEquals("-1:0:E", rover.printReport());
    }

    @Test
    public void should_return_0_1_S_when_move_back_given_0_0_S() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("RRB");

        // Then
        assertEquals("0:1:S", rover.printReport());
    }

    @Test
    public void should_return_1_0_W_when_move_back_given_0_0_W() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("LB");

        // Then
        assertEquals("1:0:W", rover.printReport());
    }

    @Test
    public void should_return_0_2_N_when_execute_commands_given_0_0_N_and_M_M() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("MM");

        // Then
        assertEquals("0:2:N", rover.printReport());
    }

    @Test
    public void should_return_0_0_N_when_execute_commands_given_0_0_N_and_M_B() {
        // Given
        MarsRover rover = new MarsRover();

        // When
        rover.executeCommands("MB");

        // Then
        assertEquals("0:0:N", rover.printReport());
    }
}