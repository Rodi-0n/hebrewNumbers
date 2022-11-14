import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Choose an option and write down the number: ");
        System.out.println("1. Show a list of numbers");
        System.out.println("2. Show 3 random numbers with translation and transcription");
        System.out.println("3. Show 3 random numbers with translation");
        System.out.println("4. Read the name of the number and enter the number");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1){showListOfNumbers.listOfNumbers();}
        else if (number == 2){showThreeNumbersWithTranscription.getThreeNumbersWithTranscription();}
        else if (number == 3){showThreeNumbersWithTranslation.getThreeNumbersWithHebrew();}
        else if (number == 4){showRandomNumberAndCheck.getRandomNumber();}
        else {
            System.out.println("I don't have this variant. Enter the number from 1 to 4");
        }
    }
}