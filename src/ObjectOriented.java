import java.util.Scanner;

class FlightBooking{
    String fromLocation;
    String toLocation;
    String onDate;
    int numOfPassengers;
    String travelClass;


    FlightBooking(){
        fromLocation = "Guwahati";
        toLocation = "Delhi";
        onDate = "26 july, 2022";
        numOfPassengers = 5;
        travelClass = "Economy";
    }
    FlightBooking(String fl, String tl, String od, int np, String tc){
        fromLocation = fl;
        toLocation = tl;
        onDate = od;
        numOfPassengers = np;
        travelClass = tc;
    }

    void updateDetails(String fl, String tl, String od, int np, String tc){
        fromLocation = fl;
        toLocation = tl;
        onDate = od;
        numOfPassengers = np;
        travelClass = tc;
    }

    void showDetails(){
        System.out.println(fromLocation+" to "+toLocation+" on "+onDate+" with "
                + numOfPassengers +" Passengers "+travelClass+" in class");
    }
}



public class ObjectOriented {
    public static void main(String... args){

        FlightBooking booking = new FlightBooking();

        booking.showDetails();

    }
}
