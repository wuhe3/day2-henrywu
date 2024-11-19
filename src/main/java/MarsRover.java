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

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            updateDirection(command);
        }
    }

    public void updateDirection(char command) {
        switch (command) {
            case 'L':
                direction = Direction.values()[(direction.ordinal() + 3) % 4];
                break;
            case 'R':
                direction = Direction.values()[(direction.ordinal() + 1) % 4];
                break;
            case 'M':
                moveForward();
                break;
            case 'B':
                moveBackward();
                break;
            default:
                System.out.println("Invalid command");
        }
    }

    public void moveForward() {
        if (direction == Direction.N) {
            yAsis++;
        } else if (direction == Direction.E) {
            xAsis++;
        } else if (direction == Direction.S) {
            yAsis--;
        } else {
            xAsis--;
        }
    }

    public void moveBackward() {
        if (direction == Direction.N) {
            yAsis--;
        } else if (direction == Direction.E) {
            xAsis--;
        } else if (direction == Direction.S) {
            yAsis++;
        } else {
            xAsis++;
        }
    }

}