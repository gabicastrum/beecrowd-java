import java.io.IOException;
import java.util.Scanner;

//1005
public class MediaUm {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double media = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }

}