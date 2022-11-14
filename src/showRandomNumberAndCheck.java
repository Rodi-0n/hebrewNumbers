import java.util.Random;
import java.util.Scanner;

public class showRandomNumberAndCheck {
    public static class showRandomNumber {
        public static final String one = "אחת";
        public static final String two = "שתים";
        public static final String three = "שלוש";
        public static final String four = "ארבע";
        private static final String five = "חמש";
        public static final String six = "שש";
        private static final String seven = "שבע";
        public static final String eight = "שמונה";
        public static final String nine = "תשע";
        public static final String ten = "עשר";
    }

    public static String getRandomNumber() {
        Random randomNumber = new Random();
        int x = randomNumber.nextInt(10) + 1;
        if (x == 1) {System.out.println(showRandomNumber.one);}
        else if (x == 2) {System.out.println(showRandomNumber.two);}
        else if (x == 3) {System.out.println(showRandomNumber.three);}
        else if (x == 4) {System.out.println(showRandomNumber.four);}
        else if (x == 5) {System.out.println(showRandomNumber.five);}
        else if (x == 6) {System.out.println(showRandomNumber.six);}
        else if (x == 7) {System.out.println(showRandomNumber.seven);}
        else if (x == 8) {System.out.println(showRandomNumber.eight);}
        else if (x == 9) {System.out.println(showRandomNumber.nine);}
        else if (x == 10) {System.out.println(showRandomNumber.ten);}
        return null;
    }
    public static String enterTheNumber() {
        System.out.println("Enter this number");
        return null;
    }
//    static Scanner scannerNumber = new Scanner(System.in);
//    static int enteredNumber = scannerNumber.nextInt();

//    public static String checkNumber() {
//        if (x.getRandomNumber == showRandomNumber.one && enteredNumber == x.getRandomNumber) {
//            System.out.println("Well done!");
//        } else {System.out.println("Oops. No. Try again");}
//
//        return null;
//    }

}