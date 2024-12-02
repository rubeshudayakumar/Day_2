import java.util.Scanner;

public class RepetitiveString {
    private final String inputString;

    private RepetitiveString(String inputString){
        this.inputString = inputString;
    }

    private void printPattern() {
        char currentCharacter = '0';
        int currentNumber = 0;
        int iterator = 0;
        while (iterator < this.inputString.length()) {
            char currentChar = this.inputString.charAt(iterator);
            if (Character.isDigit(currentChar)) {
                currentNumber = currentNumber * 10;
                currentNumber+=Character.getNumericValue(currentChar);
                iterator++;
                continue;
            }
            int count = currentNumber;
            while (count-->0) {
                System.out.print(currentCharacter);
            }
            currentCharacter = currentChar;
            currentNumber = 0;
            iterator++;
        }
        int count = currentNumber;
        while (count-->0) {
            System.out.print(currentCharacter);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepetitiveString repetitiveString = new RepetitiveString(scanner.next());
        repetitiveString.printPattern();
    }
}
