package src.day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String roomType = "";
        int night = 0;
        int totalPrice = 0;

        System.out.println();
        System.out.println("***This is room reservation service***");
        System.out.println();
        System.out.println("Here are our room type and price:" + "\nKing bed ==> 120$" + "\nQueen bed ==> 100$" + "\nSingle Bed ==> 80$");
        System.out.println();
        System.out.println("What type of room do you want to reserve?");

        roomType = scan.nextLine();

        if (roomType.equalsIgnoreCase("King Bed")){
            totalPrice = 120;

        }else if(roomType.equalsIgnoreCase("Queen Bed")){

    }else if(roomType.equalsIgnoreCase("Single Bed")) {
        System.out.println(roomType);
    }


        while (!(roomType.equals("King bed") || roomType.equals("Queen Bed") || roomType.equals("single Bed"))) {
        roomType = scan.nextLine();
        System.out.println("Invalid room type, Please re-enter");
    }

        System.out.println("How many nights?");
        night = scan.nextInt();

        System.out.println(night +" night");

        System.out.println("Would you like to reserve another room? (yes/no)");
        String reserveAnother = scan.nextLine();

        while(reserveAnother.equalsIgnoreCase("yes")) {

            System.out.println("What type of room do you want to reserve?");

            roomType = scan.nextLine();

            if ((roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed") || roomType.equalsIgnoreCase("Single Bed"))) {

                System.out.println("You reserved a : " + roomType);
        }
        while (!(roomType.equals("King bed") || roomType.equals("Queen Bed") || roomType.equals("single Bed"))) {

            roomType = scan.nextLine();

            System.out.println("Invalid room type, Please re-enter");
        }

        System.out.println("How many nights?");

        night = scan.nextInt();

        System.out.println(night + " night");

        }while(!(reserveAnother.equalsIgnoreCase("yes"))){

        System.out.println(totalPrice);
    }

        System.out.println("Reservation summary");

        System.out.println("Room type: "+roomType);

        System.out.println(night + " nights");

        System.out.println("Total price: "+totalPrice);
}
}


