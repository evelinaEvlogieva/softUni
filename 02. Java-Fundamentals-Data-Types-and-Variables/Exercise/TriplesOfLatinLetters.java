import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int begin = 97;
        int end = 97+n;

        for (int i = begin; i < end; i++) {
            for (int j = begin; j < end ; j++) {
                for (int k = begin; k < end ; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }
    }
}
