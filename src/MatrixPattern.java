import java.util.Arrays;
import java.util.Scanner;

public class MatrixPattern {
    private final int number;

    private final int[][] pattern;

    private MatrixPattern(int number){
        this.number = number;
        this.pattern = new int[3][3];
    }

    private void computePattern(){
        int reminder = this.number % 3;
        int divisor = this.number / 3;
        int[] initialArray;

        if(reminder == 0){
            pattern[0][0] = divisor -1;
            pattern[0][1] = divisor;
            pattern[0][2] = divisor + 1;
        }else if(reminder == 1){
            pattern[0][0] = divisor;
            pattern[0][1] = divisor - 1;
            pattern[0][2] = divisor + 2;
        }else{
            pattern[0][0] = divisor + 3;
            pattern[0][1] = divisor + 1;
            pattern[0][2] = divisor - 2;
        }

        initialArray = Arrays.copyOf(pattern[0],3);

        for (int i = 1; i < pattern.length; i++) {
            this.rotateArray(initialArray, pattern[i - 1][0]);
            System.arraycopy(initialArray, 0, pattern[i], 0, pattern[i].length);
        }
    }

    private void rotateArray(int[] array, int firstElement){
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = firstElement;
    }


    private void printPattern(){
        for (int[] row : this.pattern) {
            for (int element : row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixPattern matrixPattern = new MatrixPattern(scanner.nextInt());
        matrixPattern.computePattern();
        matrixPattern.printPattern();
    }
}
