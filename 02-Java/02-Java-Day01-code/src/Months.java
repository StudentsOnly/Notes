public class Months {
    public static void main(String[] args) {

        // Print out how many days in a given month

        int month = 3;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
            case 2:
                // Note: Ignore leap years
                System.out.println("28 days");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}
