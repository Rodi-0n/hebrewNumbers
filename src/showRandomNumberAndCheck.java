import java.util.Random;

public class showRandomNumberAndCheck {
    public static class showRandomNumber {
        private static final String one = "אחת";
        private static final String two = "שתים";
        private static final String three = "שלוש";
        private static final String four = "ארבע";
        private static final String five = "חמש";
        private static final String six = "שש";
        private static final String seven = "שבע";
        private static final String eight = "שמונה";
        private static final String nine = "תשע";
        private static final String ten = "עשר";
    }

    public static String getRandomNumber() {
        Random randomNumber = new Random();
        int x = randomNumber.nextInt(10) + 1;
        if (x == 1) {return showRandomNumber.one;}
        else if (x == 2) {return showRandomNumber.two;}
        else if (x == 3) {return showRandomNumber.three;}
        else if (x == 4) {return showRandomNumber.four;}
        else if (x == 5) {return showRandomNumber.five;}
        else if (x == 6) {return showRandomNumber.six;}
        else if (x == 7) {return showRandomNumber.seven;}
        else if (x == 8) {return showRandomNumber.eight;}
        else if (x == 9) {return showRandomNumber.nine;}
        else if (x == 10) {return showRandomNumber.ten;}
        else {return null;}
    }
}