import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RecursionSumOfDigits {

    private final int sum;

    private RecursionSumOfDigits(int number){
        this.sum = sumOfDigitUntilOne(number);
    }

    private int sumOfDigitUntilOne(int number) {
        if(number < 10){
            return number;
        }
        int num = number;
        int sum = 1,r;
        while(num!=0){
            r = num % 10;
            sum *= r;
            num /= 10;
        }
        return sumOfDigitUntilOne(sum);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecursionSumOfDigits recursionSumOfDigits = new RecursionSumOfDigits(scanner.nextInt());
        System.out.println(recursionSumOfDigits.getSum());
    }

    public int getSum() {
        return sum;
    }
}