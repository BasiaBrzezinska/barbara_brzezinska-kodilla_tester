import java.util.Scanner;

public class UserDialogs {
    public static String getUserName (){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length()>=2) {
                return name;
            }
            System.out.println("Name is too short, try again");
        }
    }


    public static String getColourLetter(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Select letter: R - red, B - blue, G - green, W - white, Y - yellow");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color){
                case "R" : return "red";
                case "B" : return "blue";
                case "G" : return "green";
                case "W" : return "white";
                case "Y" : return "yellow";

                default: System.out.println("We don't have that color. Select another one");
            }
        }
    }

    public static void main (String[] args) {
        System.out.println("Your color is:" + getColourLetter());
    }
}
