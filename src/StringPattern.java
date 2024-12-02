import java.util.Scanner;

public class StringPattern {

    private final String message;
    private final int limit;

    private StringPattern(String message,int limit){
        this.message = message;
        this.limit = limit;
    }

    private void printPattern(){
        System.out.println(message.substring(0,limit)+message.substring(message.length()-limit));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringPattern stringPattern = new StringPattern(scanner.next(),scanner.nextInt());
        stringPattern.printPattern();
    }
}
