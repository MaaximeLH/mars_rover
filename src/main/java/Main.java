import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------- Mars Rover --------");

        Rover rover = new Rover("Wall-E", new Earth(0, 0, 10, 3), new Position(0, 5));
        Map map     = new Map(rover);

        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-- Commandes du Mars Rover --");
            System.out.println("0. Avancer");
            System.out.println("1. Reculer");
            System.out.println("2. Aller à gauche");
            System.out.println("3. Aller à droite");
            System.out.println("-1. Exit");
            System.out.print(">>> ");
            choice = in.nextInt();

            switch (choice) {
                case 0:
                    rover.forward();
                    break;
                case 1:
                    rover.back();
                    break;
                case 2:
                    rover.left();
                    break;
                case 3:
                    rover.right();
                    break;
                case -1:
                    break;
                default:
                    System.out.println("La commande n'existe pas..");
            }

            map.show();
        } while(choice != -1);

        System.out.println("-------- Mars Rover --------");
    }

}
