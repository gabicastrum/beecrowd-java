import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

//1004
public class ProdutoSimples {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int PROD = A * B;

        System.out.printf("PROD = %d%n", PROD);

        scanner.close();
    }

}