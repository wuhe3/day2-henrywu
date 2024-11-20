public class MarsRover {

    public enum Direction {
        N, E, S, W
    }
    private int xAsis;
    private int yAsis;
    private Direction direction;

    public MarsRover() {
        this.xAsis = 0;
        this.yAsis = 0;
        this.direction = Direction.N;
    }

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
        }
    }

    public void moveForward() {
        switch (direction) {
            case N:
                yAsis++;
                break;
            case E:
                xAsis++;
                break;
            case S:
                yAsis--;
                break;
            case W:
                xAsis--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case N:
                yAsis--;
                break;
            case E:
                xAsis--;
                break;
            case S:
                yAsis++;
                break;
            case W:
                xAsis++;
                break;
        }
    }

}