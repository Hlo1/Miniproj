import java.util.Scanner;

public class Guest {
    private static String guestName;
    private static String phoneNo;
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return guestName;
    }

    public void setName(String name) {
        this.guestName = name;
    }

    public Guest(String phoneNo, String name) {
        this.phoneNo = phoneNo;
        this.guestName = name;
    }

    public static String checkName(){
        Scanner input = new Scanner(System.in);
        boolean nameValid = false;
        do {
            System.out.println("Enter guest name: ");
            guestName = input.nextLine();
            boolean checkName = false;
            //Check xem neu ten nhap vao co la xau rong
            if (guestName.isBlank()){
                checkName = true;
            }
            //Check xem neu cac ky tu nhap vao co hop le
            for(char check : guestName.toCharArray()){
                if(!(Character.isLetter(check) || check == ' ')){
                    checkName = true;
                }
            }
            //Neu hop le dung vong while neu khong yeu cau nguoi dung nhap lai
            if(!checkName){
                nameValid = true;
            }
            else System.out.println("Name invalid. Enter guest name again.");

        }while(!nameValid);
        return guestName;
    }

    public static String checkPhoneNo(){
        Scanner inputPhone = new Scanner(System.in);
        boolean phoneValid = false;
        do {
            System.out.println("Enter guest phone number: ");
            phoneNo = inputPhone.nextLine();
            boolean checkPhone = false;
            //Check xem sdt co la xau rong
            if (phoneNo.isBlank()){
                checkPhone = true;
            }
            //Check xem neu sdt nhap vao co hop le
            for(char check : phoneNo.toCharArray()){
                if(!Character.isDigit(check)){
                    checkPhone = true;
                }
            }
            //Neu hop le dung vong while neu khong yeu cau nhap lai
            if(!checkPhone){
                phoneValid = true;
            }
            else System.out.println("Phone invalid. Enter phone number again.");
        }while(!phoneValid);
        return phoneNo;
    }
}

