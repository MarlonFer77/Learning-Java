import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Antes do lançamento da exceção.");
        System.out.println("Digite um número: ");
        int number = scan.nextInt(); // Lança a exceção: InputMismatchException
        System.out.println("Você digitou o número: " + number);
        System.out.println("Depois do lançamento da exceção.");

        int[] numbers = {3, 5, 8, 10, 7};

        System.out.println("Digite um número de 0 a 4: ");
        int pos = scan.nextInt();

        System.out.println(("O número da posição " + pos + " é: " + numbers[pos] )); // ArrayIndexOutOfBoundsException
    }
}
