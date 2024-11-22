import java.util.Scanner;

public class Main {
    // global variables declaration
    static int customerID;
    static int callsMade;
    static int callMinutes;
    static double customerBill;

    // constants declaration
    final static int CALLS = 100;
    final static int MINUTES = 500;
    final static double BASIC_SERVICE = 30.0;
    final static double PREMIUM = 20.0;

    static Scanner input = new Scanner(System.in);

    public static void housekeeping() {
        // Jolin Tang
        // Display welcome message
        System.out.println("Phone Payment Calculator");

        // Darshini
        // Prompt user for customerID
        System.out.print("Enter customer ID: ");

        // Retrieve customerID
        customerID = input.nextInt();

        // Prompt user for callsMade
        System.out.print("Enter calls made: ");

        // Retrieve callsMade
        callsMade = input.nextInt();

        // Prompt user for callMinutes
        System.out.print("Enter call minutes used: ");

        // Retrieve callMinutes
        callMinutes = input.nextInt();
    }

    public static void detailLoop() {
        customerBill = BASIC_SERVICE;

//        // cascading if
//        // single alternative
//        if(callsMade > CALLS) {
//            // single alternative
//            if(callMinutes > MINUTES) {
//                customerBill += PREMIUM;
//            }
//        }

        // compounding two expressions
        // using and
        if(callsMade > CALLS && callMinutes > MINUTES) {
                customerBill += PREMIUM;
        } else {
            System.out.println("False");
        }

        System.out.println(customerID + " calls made used " + callMinutes + " minutes. Total bill is RM" + customerBill);
    }

    public static void finish() {
        // Lau Li Bin
        // Display exit message
        System.out.println("Program ended");
    }

    public static void main(String[] args) {
        housekeeping();
        detailLoop();
        finish();
    }
}