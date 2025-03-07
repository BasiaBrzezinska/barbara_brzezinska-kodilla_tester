public class LeapYear {
    public static void main (String [] args) {

        int year = 1986;

        if ( year % 4 == 0 && year % 100 != 0 ) {
            System.out.println("Rok jest przystępny");
        }
        else if ( year % 100 ==0 && year % 400 == 0 ) {
            System.out.println("też jest rok przystępny");
        }
        else {
            System.out.println("Rok jest nie przystępny");
        }


    }
}
