import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printMatrix(number);

    }

    static void printMatrix (int number){
        for (int i = 0; i < number ; i++) {
            for (int j = 0; j < number ; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}
