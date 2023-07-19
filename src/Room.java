import java.util.Scanner;

public class Room {
    private int roomNo;
    private String status;
    private Guest guest;
    public int getRoomNo() {
        return roomNo;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Room(int roomNo, String status, Guest guest) {
        this.roomNo = roomNo;
        this.status = status;
        this.guest = guest;
    }

    public static int checkRoomNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the room number: ");
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Room number invalaid. Enter the room number again.");
                System.out.print("Enter the room number: ");
            }
        }
    }
}