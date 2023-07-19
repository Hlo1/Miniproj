import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel("Dai U","Ba Dinh", 10);
        hotel.createRoomList();
        Receptionist receptionist = new Receptionist(hotel);
        int choice;

        do {
            System.out.println("Hello thank for using hotel management system of " + hotel.getHotelName() + " hotel!");
            System.out.println("----------------------------------------------------");
            System.out.println("1. Check-in Guest");
            System.out.println("2. Check-out Guest");
            System.out.println("3. Check Available Room");
            System.out.println("4. Display Room Information");
            System.out.println("5. Payment");
            System.out.println("6. Exit");
            System.out.println("----------------------------------------------------");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1:
                    receptionist.checkIn();
                    break;
                case 2:
                    receptionist.checkOut();
                    break;
                case 3:
                    receptionist.findEmptyRoom();
                    break;
                case 4:
                    receptionist.displayRoomInfo();
                    break;
                case 5:
                    receptionist.CheckBill();
                    break;
                case 6:
                    System.out.println("Exit system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while(choice != 6);
        input.close();

    }
}