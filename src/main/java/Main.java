import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------- Mars Rover --------");
        Rover rover = new Rover("Wall-E", 2, new Position(10, 2));
        System.out.println(rover);

        Scanner in = new Scanner(System.in);
        int menu = 0;
        do {

            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Avancer");
            System.out.println("2. Reculer");
            System.out.println("3. Aller à gauche");
            System.out.println("4. Aller à droite");
            System.out.println("5. Exit");
            System.out.println(">>> ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    rover.goForward();
                    break;
                case 2:
                    rover.goBack();
                    break;
                case 3:
                    rover.goLeft();
                    break;
                case 4:
                    rover.goRight();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Hein ?");
            }

            rover.printMap();
        } while (menu != 5);
    }

}
