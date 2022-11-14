public class showThreeNumbersWithTranslation {
    public static int threeNumbersWithHebrew(){
        return (int) (Math.random() * 10) + 1;
    }

    public static String getThreeNumbersWithHebrew(){
        for(int i = 0; i < 3; i++) {
            int y = threeNumbersWithHebrew();
            if (y == 1) {
                System.out.println("1 - אחת");
            } else if (y == 2) {
                System.out.println("2 - שתים");
            } else if (y == 3) {
                System.out.println("3 - שלוש");
            } else if (y == 4) {
                System.out.println("4 - ארבע");
            } else if (y == 5) {
                System.out.println("5 - חמש");
            } else if (y == 6) {
                System.out.println("6 - שש");
            } else if (y == 7) {
                System.out.println("7 - שבע");
            } else if (y == 8) {
                System.out.println("8 - שמונה");
            } else if (y == 9) {
                System.out.println("9 - תשע");
            } else if (y == 10) {
                System.out.println("10 - עשר");
            }
        }
        return null;
    }
}