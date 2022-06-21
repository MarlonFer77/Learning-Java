import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        try {
            long number = scan.nextLong();
            System.out.println("O número digitado foi: " + number);
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println("VOCÊ É BURRO OU OQUE ? DIGITA UM NÚMERO INTEIRO K7!");
        }finally {
            System.out.println("Obrigatoriamente, você passa por aqui.");
        }
    }
}
