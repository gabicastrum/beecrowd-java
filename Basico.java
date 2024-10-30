import java.io.IOException;
import java.util.Scanner;

//1001
public class Basico {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.printf("X = %d%n", X);

        scanner.close();
    }

}