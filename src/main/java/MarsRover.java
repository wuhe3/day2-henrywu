
public class MarsRover {

    private int xAsis = 0;
    private int yAsis = 0;
    private char direction = 'N';


    public String printReport() {
        return String.format("%d:%d:%c", xAsis, yAsis, direction);
    }


    public void executeCommand(char command) {
        switch (command) {
            case 'L':
                direction = 'W';
                break;
            case 'R':
                direction = 'E';
                break;
            default:
                System.out.println("Invalid command");
        }

        printReport();
    }



}
