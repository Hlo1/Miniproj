public class Bill {
    private double stayDays;
    private Room room;

    public Bill(double stayDays, Room room) {
        this.stayDays = stayDays;
        this.room = room;
    }

    public double calculateBill(){
        return 600*stayDays;
    }
}