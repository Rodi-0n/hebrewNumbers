public class showThreeNumbersWithTranscription {
    public static int numbersWithTranscription(){
        return (int) (Math.random() * 10) + 1;
    }

    public static String getThreeNumbersWithTranscription(){
        for(int i = 0; i < 3; i++) {
            int x = numbersWithTranscription();
            if (x == 1) {
                System.out.println("1 - ahat - אחת");
            } else if (x == 2) {
                System.out.println("2 - shtaim - שתים");
            } else if (x == 3) {
                System.out.println("3 - shalosh - שלוש");
            } else if (x == 4) {
                System.out.println("4 - arbah - ארבע");
            } else if (x == 5) {
                System.out.println("5 - hamesh - חמש");
            } else if (x == 6) {
                System.out.println("6 - shesh - שש");
            } else if (x == 7) {
                System.out.println("7 - sheva - שבע");
            } else if (x == 8) {
                System.out.println("8 - shmone - שמונה");
            } else if (x == 9) {
                System.out.println("9 - teisha - תשע");
            } else if (x == 10) {
                System.out.println("10 - eser - עשר");
            }
        }
        return null;
    }
}
