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
        switch (command) {
            case 'L':
                direction = Direction.W;
                break;
            case 'R':
                direction = Direction.E;
                break;
            default:
                System.out.println("Invalid command");
        }

        printReport();
    }

}
