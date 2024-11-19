public class MarsRover {

    public enum Direction {
        N, E, S, W
    }
    public int xAsis = 0;
    public int yAsis = 0;
    public Direction direction = Direction.N;

    public String printReport() {
        return String.format("%d:%d:%s", xAsis, yAsis, direction);
    }

    public void executeCommand(char command) {
        updateDirection(command);
        printReport();
    }

    private void updateDirection(char command) {
        if (command == 'L') {
            direction = Direction.values()[(direction.ordinal() + 3) % 4];
        } else if (command == 'R') {
            direction = Direction.values()[(direction.ordinal() + 1) % 4];
        } else {
            System.out.println("Invalid command");
        }
    }
}