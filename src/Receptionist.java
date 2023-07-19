import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Receptionist {
    private List<Room> rooms;
    private List<Guest> guests;


    public Receptionist(Hotel hotel) {
        this.rooms = hotel.getRooms();
        guests = new ArrayList<>();
    }

    public void findEmptyRoom(){
        System.out.println("List of unoccupied rooms: ");
        for(Room room : rooms){
            if(room.getStatus().equals("Empty")){
                System.out.println("Room " + room.getRoomNo());
            }
        }
    }

    public void checkIn(){
        int roomNum = Room.checkRoomNo();
        for(Room room : rooms){
            if(room.getRoomNo() == roomNum){
                if(room.getStatus().equals("Empty")){
                    String guestName = Guest.checkName();
                    String guestPhoneNo = Guest.checkPhoneNo();
                    Guest guest = new Guest(guestPhoneNo, guestName);
                    room.setGuest(guest);
                    room.setStatus("Occupied");
                    guests.add(new Guest(guestPhoneNo,guestName));
                    System.out.println("Successful check in");
                }
                else {
                    System.out.println("Room not available");
                }
                break;
            }
        }
    }

    public void checkOut(){
        if(guests.isEmpty()){
            System.out.println("No room need to be paid");
        }
        else {
            int roomNumber = Room.checkRoomNo();
            for (Room room : rooms) {
                if (room.getRoomNo() == roomNumber) {
                    if (room.getStatus().equals("Occupied")) {
                        String guestName = room.getGuest().getName();
                        room.getGuest().setName("");
                        room.getGuest().setPhoneNo("");
                        room.setStatus("Empty");
                        guests.removeIf(guest -> guest.getName().equals(guestName));
                        System.out.println("Successful check out");
                    } else {
                        System.out.println("Room is empty.");
                    }
                    break;
                }
            }
        }
    }

    public void CheckBill() {
        if(guests.isEmpty()) {
            System.out.println("No room for paying!");
        } else {
            int roomNumber = Room.checkRoomNo();
            System.out.print("Enter the number of days: ");
            Scanner sc = new Scanner(System.in);
            double numDays = sc.nextDouble();
            for (Room room : rooms) {
                if (room.getRoomNo() == roomNumber) {
                    Bill bill = new Bill(numDays, room);
                    System.out.println("The bill of Room " + room.getRoomNo() + " with " + numDays + " days: " + bill.calculateBill());
                }
            }
        }
    }

    public void displayRoomInfo() {
        for (Room room : rooms) {
            int roomName = room.getRoomNo();
            String status = room.getStatus();
            String guestPhoneNo = room.getGuest().getPhoneNo();
            String guestName = room.getGuest().getName();

            System.out.println("Room: " + roomName);
            System.out.println("Status: " + status);
            System.out.println("Guest Phone Number: " + guestPhoneNo);
            System.out.println("Guest: " + (guestName.isEmpty() ? "None" : guestName));
        }
    }




}
