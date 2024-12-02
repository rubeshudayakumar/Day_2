import java.util.Arrays;
import java.util.Scanner;

public class AddingNumbersStartEnd {
    private final String number;

    private AddingNumbersStartEnd(String number){
        this.number = number;
    }

    private void addAll(){
        int sum = 0;
        for (int i = 0; i < number.length() / 2; i++) {
            sum += (Integer.parseInt(
                    new String(new char[] {
                            number.charAt(i),
                            number.charAt(number.length()-i-1)
                    })));
        }
        if(number.length() % 2 !=0){
            sum+= (Integer.parseInt(String.valueOf(number.charAt(number.length()/2))));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddingNumbersStartEnd addingNumbersStartEnd = new AddingNumbersStartEnd(scanner.next());
        addingNumbersStartEnd.addAll();
    }
}
