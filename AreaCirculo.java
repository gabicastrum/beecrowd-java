import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

//1002

public class AreaCirculo {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double raio = scanner.nextDouble();

        final double PI = 3.14159;

        double area = PI * raio * raio;

        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }

}