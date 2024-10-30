import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

//1003

public class SomaSimples {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A + B;

        System.out.printf("SOMA = %d%n", SOMA);

        scanner.close();
    }

}