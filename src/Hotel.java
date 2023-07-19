import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String hotelName, location;
    private int numberOfRooms;
    private List<Room> rooms;

    public Hotel(String hotelName, String location, int numberOfRooms){
        this.hotelName = hotelName;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        rooms = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void createRoomList(){
        for(int i=1; i < numberOfRooms; i++){
            int roomNo = i;
            String status = "Empty";
            Guest guest = new Guest("","");
            Room room = new Room(roomNo,status,guest);
            rooms.add(room);
        }
    }

    public List<Room> getRooms(){
        return rooms;
    }
}