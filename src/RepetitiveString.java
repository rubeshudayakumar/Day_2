import java.util.Scanner;

public class RepetitiveString {
    private String inputString;

    private RepetitiveString(String inputString){
        this.inputString = inputString;
    }

    private void printPattern(){
        int currentIndex = 0;

        while (currentIndex != this.inputString.length() - 1){
            int[] result = getNumberLimit(currentIndex);

            while (result[1]!=0){
                System.out.print(this.inputString.charAt(currentIndex));
                result[1]--;
            }
            currentIndex = result[0];
        }
    }

    private int[] getNumberLimit(int currentIndex){
        int number = 0;
        while (Character.isDigit(this.inputString.charAt(currentIndex+1))){
            number+= Integer.parseInt(String.valueOf(this.inputString.charAt(currentIndex+1)));
            currentIndex+=1;
            number*=10;
        }
        return new int[]{currentIndex,number/10};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepetitiveString repetitiveString = new RepetitiveString(scanner.next());
        repetitiveString.printPattern();
    }
}
